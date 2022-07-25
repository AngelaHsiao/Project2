package com.revature.project2.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtils {
//	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
    private static Configuration config;
	
	  public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	            	
	            
	                //sets the properties for the session factory here instead of in hibernate.cfg.xml
	                Properties prop=new Properties();
	                prop.put(Environment.DRIVER, "org.postgresql.Driver");
	                prop.put(Environment.URL, System.getenv("TCF_URL_FULL"));     
	                prop.put(Environment.USER, System.getenv("TCF_USER"));
	                prop.put(Environment.PASS, System.getenv("TCF_PASS"));
	                prop.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
	                prop.put(Environment.SHOW_SQL, "true");
	                prop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	                prop.put(Environment.HBM2DDL_AUTO, "update");
	                
	                
	                config=new Configuration().setProperties(prop);
	                
	                
	                //syntax to add a new annotated class
	               config.addAnnotatedClass(com.revature.project2.pojo.Customer.class);
	                
	          
	                sessionFactory = config.buildSessionFactory();
	            } catch (Exception e) {
	                e.printStackTrace();
//	                if (registry != null) {
//	                    StandardServiceRegistryBuilder.destroy(registry);
//	                }
	            }
	        }
	        return sessionFactory;
	    }
	   
	    
}
