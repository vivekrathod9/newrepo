package com.clc.mvc.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.pool.BasePoolableObjectFactory;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.clc.mvc.*" })
@PropertySource("classpath:database.properties")
public class SpringBeanConfig {
	@Value("${mysql.database.url}")
	private String DB_URL;
	@Value("${mysql.database.username}")
	private String DB_UERNAME;
	@Value("${mysql.database.password}")
	private String DB_PASSWORD;
	@Value("${mysql.database.driver_class}")
	private String DB_DRIVER_CLASS;
	@Value("${mysql.database.dialect}")
	private String DB_DIALECT;
	@Value("${mysql.database.hbm2ddl}")
	private String DB_HBM2DDL;
	@Value("${mysql.database.show_sql}")
	private String DB_SHOW_SQL;
	@Value("${mysql.database.format_sql}")
	private String DB_FORMAT_SQL;
	@Value("${mysql.database.packageToScan}")
	private String DB_PACKAGETOSCAN;

	@Bean
	public BasicDataSource createDatasource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(DB_DRIVER_CLASS);
		ds.setUsername(DB_UERNAME);
		ds.setPassword(DB_PASSWORD);
		ds.setUrl(DB_URL);
		return ds;
	}

	@Bean
	public LocalSessionFactoryBean createSessionFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setPackagesToScan(DB_PACKAGETOSCAN);
		sf.setDataSource(createDatasource());
		sf.setHibernateProperties(createHibernateProp());
		return sf;
	}

	public Properties createHibernateProp() {
		Properties prop = new Properties();
		prop.put(Environment.DIALECT, DB_DIALECT);
		prop.put(Environment.SHOW_SQL, DB_SHOW_SQL);
		prop.put(Environment.FORMAT_SQL, DB_FORMAT_SQL);
		return prop;
	}
	@Bean	
	public ViewResolver viewResolver() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setViewClass(JstlView.class);
		view.setPrefix("/WEB-INF/");
		view.setSuffix(".jsp");		
		return view;
	}
}	
