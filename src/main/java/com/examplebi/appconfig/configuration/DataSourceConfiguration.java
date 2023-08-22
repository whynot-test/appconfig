package com.examplebi.appconfig.configuration;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.thunisoft.summer.component.crypto.defaultDecrypt.DESedeDecryptor;

/**
 * @Author: bi
 * @createTime: 2023年08月21日 23:51:48
 * @version: 1.0
 * @Description: 数据源配置类
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {

    private static Logger logger = LoggerFactory.getLogger(DataSourceConfiguration.class);

    private static final String ENCRYPT_HEAD = "ENCRYPT#";

    @Value("$({dataSource.jdbcUrl}")
    private String dataSourceUrl;

    @Value("${dataSource.user}")
    private String dataSourceUsername;

    @Value("${dataSource.password}")
    private String dataSourcePassword;

    @Value("${dataSource.driverClass}")
    private String dataSourceDriver;
    @Value("${dataSource.maxPoolSize:15}")
    private int maxPoolSize;
    @Value("${dataSource.initPoolSize:3}")
    private int initPoolSize;

    private DESedeDecryptor decryptor = new DESedeDecryptor();

    @Bean
    public DataSource dataSource() throws ClassNotFoundException {
        Class.forName(dataSourceDriver);

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create().type(ComboPooledDataSource.class);

        if (dataSourceUsername.startsWith(ENCRYPT_HEAD)) {
            String userAfterDecrtpted = decryptor.decrypt(dataSourceUsername.substring(ENCRYPT_HEAD.length()));
            dataSourceBuilder.username(userAfterDecrtpted);
        } else {
            dataSourceBuilder.username(dataSourceUsername);
        }

        if (dataSourcePassword.startsWith(ENCRYPT_HEAD)) {
            String decryptPassword = decryptor.decrypt(dataSourcePassword.substring(ENCRYPT_HEAD.length()));
            dataSourceBuilder.password(decryptPassword);
        } else {
            dataSourceBuilder.password(dataSourcePassword);
        }

        ComboPooledDataSource dataSource = (ComboPooledDataSource) dataSourceBuilder.build();
        dataSource.setIdleConnectionTestPeriod(1800);
        dataSource.setPreferredTestQuery("select 1 ");
        dataSource.setInitialPoolSize(initPoolSize);
        dataSource.setMaxPoolSize(maxPoolSize);
        logger.info("初始化数据源！");
        return dataSource;
    }

    public String getDataSourceUrl() {
        return dataSourceUrl;
    }

    public boolean isDmDataBase() {
        return dataSourceUrl.startsWith("jdbc:dm") || dataSourceUrl.startsWith("jdbc.log4jdbc:dm");
    }
}