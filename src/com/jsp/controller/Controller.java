package com.jsp.controller;

import com.jsp.dao.CarDao;

public class Controller {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CarDao carDao=new CarDao();
		//carDao.saveCar();
		/*int a=carDao.updateCar();
        if(a>0)
        {
        	System.out.println("Data updated");
        }
        else
        {
        	System.out.println("Data not updated");
        }*/
		//carDao.deleteCar();
		//carDao.getAllCars();
		carDao.getAllCarById();
		
	}

}
