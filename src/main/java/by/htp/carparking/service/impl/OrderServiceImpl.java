package by.htp.carparking.service.impl;

import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.dao.impl.OrderDaoDBImpl;
import by.htp.carparking.service.OrderService;

public class OrderServiceImpl implements OrderService {
/*
	private OrderDao orderDao;
	
	public OrderServiceImpl() {
	}
	
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	@Override
	public void orderCar(int userId, int carId, Date startDate, Date endDate) {
		
		orderDao.insertNewOrder(userId, carId, startDate, endDate);
	}*/
	//TODO add IoC
	private OrderDao orderDao = new OrderDaoDBImpl();
	
	@Override
	public void orderCar(int userId, int carId) {
		
		orderDao.insertNewOrder(userId, carId);
	}

}
