package com.lijx.config;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DateSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource.default")
	public DataSourceProperties defauleDataSourceProperties() {
		DataSourceProperties defaultProperties = new DataSourceProperties();
		defaultProperties.setInitialize(false);
		return defaultProperties;
	}
	
	@Bean(name = "defaultDataSource")
	@ConfigurationProperties("spring.datasource")
	public DataSource defaultDataSource(DataSourceProperties defauleDataSourceProperties) {
		return defauleDataSourceProperties.initializeDataSourceBuilder().build();
	}

	@Primary
	@Bean
	public DataSource dynamicDataSource(DataSource defaultDataSource) {
		DynamicDataSource dynamicDataSource = new DynamicDataSource();
		Map<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put(DynamicDataSource.DEFAULT_DATASOURCE, defaultDataSource);

		
		dynamicDataSource.setDefaultTargetDataSource(defaultDataSource);
		dynamicDataSource.setTargetDataSources(targetDataSources);
		return dynamicDataSource;
	}
}
