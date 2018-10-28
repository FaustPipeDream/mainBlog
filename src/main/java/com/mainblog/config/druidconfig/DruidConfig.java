package com.mainblog.config.druidconfig;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Indexalice
 * @date 2018/10/20 22:07
 */
@Configuration
public class DruidConfig {
  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource druidDataSource() {
    return new DruidDataSource();
  }
}


