package by.htp.carparking.temp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.hbm.SessionFactoryManager;
import by.htp.carparking.domain.Car;

@SuppressWarnings({ "resource" })
public class MainApp {

	public static void main(String[] args) {
	
		
/*		BaseDao dao = new CarDaoDBImpl();
		dao.create(new Car());*/
		
		SessionFactory factory = SessionFactoryManager.getSessionFactory();
		@SuppressWarnings("resource")
		Session session = factory.openSession();
		System.out.println(session.hashCode() + " hashCode");
		
//		session = factory.getCurrentSession();
		
		session.close();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		CarDao dao = (CarDao) appContext.getBean("carDao");
		List<Car> cars = dao.readAll();
		System.out.println(cars.size());
		
	}

}
