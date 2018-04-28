package by.htp.carparking.dao.hbm;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public final class SessionFactoryManager {
	
	private static SessionFactory sessionFactory;	
	private static SessionFactory buildSessionFactory() {
		
		Configuration configuration = new Configuration();		
		configuration.configure("config/hibernate.cfg.xml"); //парсит
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		return configuration.buildSessionFactory(serviceRegistry); //создает объект который подключается к базе
	}
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
		   sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

}
