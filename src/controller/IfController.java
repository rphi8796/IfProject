package controller;

import model.WaterBottle;

import javax.swing.JOptionPane;

public class IfController
{
	private WaterBottle hydroFlask;
	private WaterBottle userWaterBottle;
	private String userInput;
	
	
	/**
	 * Builds of the Controller
	 */
	public IfController()
	{
		hydroFlask = new WaterBottle("Grey", "Straw", "Metal", 40, true);
		userWaterBottle = new WaterBottle();
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	
	public void start()
	{
		String color = JOptionPane.showInputDialog(null, "What is the color of your water bottle?");
		userWaterBottle.setColor(color);
		JOptionPane.showMessageDialog(null, "Your water bottle has a beatiful " + userWaterBottle.getColor() + " color.");
		
		
		String lydType = JOptionPane.showInputDialog(null, "What kind of lid does your water have?");
		userWaterBottle.setLidType(lydType);
		JOptionPane.showMessageDialog(null, "Your water bottle has a " + userWaterBottle.getLidType() + " lid");
		
	
		String material = JOptionPane.showInputDialog(null, "What is a majority of your water bottle made of?");
		userWaterBottle.setMaterial(material);
		JOptionPane.showMessageDialog(null, "Your water bottle is made of " + userWaterBottle.getMaterial());
		
		
		String userInput = JOptionPane.showInputDialog(null, "How many fluid ounces are in your water bottle?");
		while(!validInt(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "got to do right answer");
		}
		int fluidOz = 0;
		if (validInt(userInput))
		{
			fluidOz = Integer.parseInt(userInput);
		}
		
		userWaterBottle.setFluidOz(fluidOz);
		JOptionPane.showMessageDialog(null, "Your water bottle holds " + userWaterBottle.getFluidOz() + " fluid ounces");
		
		
		String userInput2 = JOptionPane.showInputDialog(null, "Is your water bottle insulated?");
		boolean insulated = false;
		insulated = Boolean.parseBoolean(userInput2);
		userWaterBottle.setinsulated(insulated);
		if (insulated = false)
		{
			JOptionPane.showMessageDialog(null, "Your water bottle is not insulated.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your water bottle is isulated." );
		}
		
	}
	
	
			
	public boolean validInt(String maybeInt)
	{
		
		boolean isValid = false;
			
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number");
		}
		
		return isValid;	
	}
}
