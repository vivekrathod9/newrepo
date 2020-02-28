package com.indexial.swagger;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.indexial.swagger")
@EnableSwagger2
@PropertySource("classpath:constant.properties")
public class SpringConfig {


	@Value("${spring.db.url}")
	String DB_URL;
	@Value("${spring.db.driver}")
	String DB_DRIVER;
	@Value("${spring.db.username}")
	String DB_USERNAME;
	@Value("${spring.db.password}")
	String DB_PASSWORD;
	@Value("${spring.db.dialect}")
	String DB_DIALECT;
	@Value("${spring.db.hbm2ddl}")
	String DB_HBM2DDL;
	@Value("${spring.db.packageToScan}")
	String DB_PACKAGESTOSCAN;
	
	@Bean
public BasicDataSource createDataSource(){
	BasicDataSource ds=new BasicDataSource();
	ds.setUrl(DB_URL);
	ds.setUsername(DB_USERNAME);
	ds.setPassword(DB_PASSWORD);
	ds.setDriverClassName(DB_DRIVER);
	return ds;
}

	@Bean
	public LocalSessionFactoryBean createSession(){
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(createDataSource());
		sf.setPackagesToScan(DB_PACKAGESTOSCAN);
		sf.setHibernateProperties(createHbProp());
		return sf;
	}

	
	private Properties createHbProp() {
		Properties prop=new Properties();
		prop.put(Environment.DIALECT, DB_DIALECT);
		prop.put(Environment.HBM2DDL_AUTO, "create");
		prop.put(Environment.SHOW_SQL, true);
		prop.put("hibernate.temp.use_jdbc_metadata_defaults",false);
		return prop;
	}
	
	@Bean
	public InternalResourceViewResolver createView() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setViewClass(JstlView.class);
		view.setPrefix("/WEB-INF/");
		view.setSuffix(".jsp");
		return view;
	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Sample APIs")
                .description("This page lists all the rest apis for Swagger Sample App.")
                .version("1.0-SNAPSHOT")
                .build();
    }

    // Only select apis that matches the given Predicates.
    private Predicate<String> paths() {
    	// Match all paths except /error
        return Predicates.and(
        	PathSelectors.regex("/.*"), 
        	Predicates.not(PathSelectors.regex("/error.*"))
        );
    }
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths())
                .build();
    }

}
