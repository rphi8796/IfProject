package controller;

import model.WaterBottle;

import javax.swing.JOptionPane;

public class IfController
{
	//private WaterBottle hydroFlask;
	private WaterBottle userWaterBottle;
	
	
	/**
	 * Builds of the Controller
	 */
	public IfController()
	{
		//hydroFlask = new WaterBottle("Grey", "Straw", "Metal", 40, true);
		userWaterBottle = new WaterBottle();
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	
	public void start()
	{
	
		uselessQuestion();
		
		//add for loop here
		usefulQuestions();
		
	}
	
	public void uselessQuestion()
	{
		boolean answer = true;
		while (answer)
		{
			String userInput = JOptionPane.showInputDialog(null, "Would you like an annoying pop up to ask you useless questions?");
			if (userInput.equals("Yes") || userInput.equals("yes"))
			{
				answer = true;
			}
			else
			{
				answer = false;
			}
		}
	}	
	
	public void usefulQuestions()
	{
		String color = JOptionPane.showInputDialog(null, "What is the color of your water bottle?");
		while (color == null || color.equals(""))
		{
			color = JOptionPane.showInputDialog(null, "Type in a color");
		}
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
		
		
		
		
		//boolean insulated = true;
		//insulated = Boolean.parseBoolean(userInput2);
		//userWaterBottle.setinsulated(insulated);
		boolean insulatedTest = true;
		while(insulatedTest)
		{
			String userInput2 = JOptionPane.showInputDialog(null, "Is your water bottle insulated?");
			if (userInput2.equals("Yes") || userInput2.equals("yes"))
			{
				JOptionPane.showMessageDialog(null, "Your water bottle is insulated.");
				userWaterBottle.setInsulated(" ");
				insulatedTest = false;
			}
			else if(userInput2.equals("No") || userInput2.equals("no"))
			{
				JOptionPane.showMessageDialog(null, "Your water bottle is not insulated." );
				userWaterBottle.setInsulated(" not ");
				insulatedTest = false;
			}
			else
			{
				JOptionPane.showInputDialog(null, "Please answer with 'Yes' or 'No'");
				insulatedTest = true;
			}
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
