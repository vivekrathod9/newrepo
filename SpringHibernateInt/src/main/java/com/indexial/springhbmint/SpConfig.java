package com.indexial.springhbmint;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class SpConfig {
	@Bean
	public BasicDataSource createdbConfig() {
		BasicDataSource db = new BasicDataSource();
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		db.setUrl("jdbc:mysql://localhost/college");
		db.setUsername("root");
		db.setPassword("123@Vivek");
		return db;
	}

	@Bean("factory")
	public LocalSessionFactoryBean createSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(createdbConfig());
		factoryBean.setPackagesToScan("com.indexial.springhbmint");
		factoryBean.setHibernateProperties(getHbmProp());
		return factoryBean;

	}

	public Properties getHbmProp() {
		Properties property = new Properties();
		property.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		property.put(Environment.SHOW_SQL,true);
		property.put(Environment.HBM2DDL_AUTO, "create");
		return property;

	}

}
