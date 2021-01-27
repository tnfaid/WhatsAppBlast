package com.miniProject.whatsAppMessageSend.Database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@PropertySource(value={"classpath:application.properties"})
@Configuration
public class DbCoreConfig
{
    @Bean(name = "waDataSource")
    DataSource initWaDataSource(
            @Value("${db.maxPoolsize.wa}") int poolSize,
            @Value("${db.username.wa}") String username,
            @Value("${db.password.wa}") String password,
            @Value("${db.url.wa}") String url,
            @Value("${spring.datasource.driver-class-name}") String driverClass,
            @Value("${db.leakDetectionThreshold}") int leakDetectionThreshold,
            @Value("${db.connectionTimeout}") int connectionTimeout,
            @Value("${db.connectionMaxLifetime}") int connectionMaxLifetime)
    {
        String namepool = "sms-db-connection-pool";

        final HikariDataSource hikariDataSource = init(poolSize, username, password, url,
                driverClass, leakDetectionThreshold, connectionTimeout, connectionMaxLifetime, namepool);
        return hikariDataSource;
    }

    private HikariDataSource init( int poolSize, String username, String password, String url, String driverClass, int leakDetectionThreshold, int connectionTimeout, int connectionMaxLifetime, String namepool )
    {
        final HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(poolSize);
        config.setUsername(username);
        config.setPassword(password);
        config.setJdbcUrl(url);
        config.setDriverClassName(driverClass);
        config.setLeakDetectionThreshold(leakDetectionThreshold * 1000);
        config.setConnectionTimeout(connectionTimeout * 1000);
        config.setMaxLifetime((connectionMaxLifetime * 60)* 1000);
        config.setPoolName(namepool);

        return new HikariDataSource(config);
    }


}
