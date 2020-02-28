package com.clc.hbm.mergeandupdate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateProp {

	public static SessionFactory getSessionFactory() {
		Properties prop = new Properties();
		prop.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		prop.setProperty(Environment.HBM2DDL_AUTO, "update");
		prop.setProperty(Environment.URL, "jdbc:mysql://localhost/hibernatedb");
		prop.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		prop.setProperty(Environment.USER, "root");
		prop.setProperty(Environment.PASS, "123@Vivek");
		prop.setProperty(Environment.SHOW_SQL, "true");

		Configuration conf = new Configuration();
		conf.setProperties(prop);
		conf.addAnnotatedClass(Employee.class);

		StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());

		SessionFactory sf = conf.buildSessionFactory(sb.build());
		return sf;

	}
}