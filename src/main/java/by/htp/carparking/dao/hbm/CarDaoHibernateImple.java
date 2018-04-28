package by.htp.carparking.dao.hbm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;

public class CarDaoHibernateImple implements CarDao{

	@Override
	public void create(Car entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public Car read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> readAll() {
		Session session = SessionFactoryManager
				.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Car.class);
		System.out.println("readAll CarDaoHibernateImple");
		
		return criteria.list();
		
	}

	@Override
	public void update(Car entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
