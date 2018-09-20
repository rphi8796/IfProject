package controller;

import model.WaterBottle;



public class IfController
{
	private WaterBottle hydroFlask;
	private WaterBottle userWaterBottle;
	
	public IfController()
	{
		hydroFlask = new WaterBottle("Grey", "Straw", "Metal", 40, true);
		userWaterBottle = new WaterBottle();
	}
	
	
	public void start()
	{
		
	}
}
