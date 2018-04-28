package by.htp.carparking.web.action.impl;

import static by.htp.carparking.web.util.HttpRequestParamFormatter.formatString;
import static by.htp.carparking.web.util.WebConstantDeclaration.PAGE_USER_MAIN;
import static by.htp.carparking.web.util.WebConstantDeclaration.REQUEST_MSG_SUCCESS;
import static by.htp.carparking.web.util.WebConstantDeclaration.REQUEST_PARAM_CAR_ID;
import static by.htp.carparking.web.util.WebConstantDeclaration.REQUEST_PARAM_USER_ID;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.service.OrderService;
import by.htp.carparking.web.action.BaseAction;

public class OrderCarAction implements BaseAction {
	
	
	public OrderCarAction() {		
	}
	
	private OrderService orderService;
	
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public String executeAction(HttpServletRequest request) {
		
		String carId = request.getParameter(REQUEST_PARAM_CAR_ID);
		String userId = request.getParameter(REQUEST_PARAM_USER_ID);//todo
		String startDate = request.getParameter("car_order_start_date");
		String endDate = request.getParameter("car_order_end_date");
		System.out.println(carId + " carId");
		System.out.println(userId + " userId");
		System.out.println(startDate + " startDate");
		System.out.println(endDate + " endDate");

		
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd");
        try
        {
    		orderService.orderCar(formatString(userId), formatString(carId)/*, format.parse(startDate), format.parse(endDate)*/);
        }
        catch (/*ParseException e*/NullPointerException e)
        {
 //           e.printStackTrace();
        }

//		validateRequestParamNotNull(carId, userId);
//		orderService.orderCar(formatString(userId), formatString(carId));
		request.setAttribute(REQUEST_MSG_SUCCESS, "The car was ordered succesfully");
		return PAGE_USER_MAIN;
	}

}
