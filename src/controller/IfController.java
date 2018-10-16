package controller;

import model.WaterBottle;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class IfController
{
	//private WaterBottle hydroFlask;
	private WaterBottle userWaterBottle;
	/**
	 * Builds of the Controller
	 */
	
	
//_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\	
	
	
	public IfController()
	{
		//hydroFlask = new WaterBottle("Grey", "Straw", "Metal", 40, true);
		userWaterBottle = new WaterBottle();
	}
	
	
//_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
	
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
	
		uselessQuestion();
		
		for (int x = 2; x > 0; x --)
		{
			usefulQuestions();
		}
		
		diceGame();
		
		createArrayList();
		
		
	}
	
	
//_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
	
	
	
	/**
	 * This method will ask the user a useless question until
	 * the user does not enter yes
	 */
	public void uselessQuestion()
	{
		boolean answer = true;
		while (answer)
		{
			String userInput = JOptionPane.showInputDialog(null, "Would you like an annoying pop up to ask you useless questions?");
			if (userInput.equalsIgnoreCase("Yes"))
			{
				answer = true;
			}
			else
			{
				answer = false;
			}
		}
	}	
	
	
//_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\	
	
	
	/**
	 * This is the method that will ask questions about the
	 * person's water bottle and then tell them about their
	 * water bottle
	 */
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
			userInput = JOptionPane.showInputDialog(null, "Please enter an integer");
		}
		int fluidOz = 0;
		if (validInt(userInput))
		{
			fluidOz = Integer.parseInt(userInput);
		}
		
		userWaterBottle.setFluidOz(fluidOz);
		JOptionPane.showMessageDialog(null, "Your water bottle holds " + userWaterBottle.getFluidOz() + " fluid ounces");
		
		
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
	
	
//_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
	
	
	/**
	 * This will ask the user if they would like to guess
	 * what a dice was equal to. It will give them two tries to guess
	 * the correct value.
	 * still need work
	 */
	public void diceGame()
	{
		final int TRIES = 2;
		int dice = (int) (Math.random() * 6 + 1);
		int guesses = 0;
		boolean gameOver = false;
		while ((guesses <= TRIES) && (!gameOver))
		{
			String userInput = JOptionPane.showInputDialog(null, "Guess what number the dice rolled ");
			while (!validInt(userInput))
			{
				userInput = JOptionPane.showInputDialog(null, "Enter a whole number between one and six.");
			}

			if (validInt(userInput))
			{
				int guess = Integer.parseInt(userInput);
				if (guess == dice)
				{
					JOptionPane.showMessageDialog(null, "You are correct the dice rolled a " + dice);
					gameOver = true;

				}
				else if ((guess != dice) && (guesses < TRIES))
				{
					JOptionPane.showMessageDialog(null, "That guess wasn't correct but guess again");
					guesses += 1;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Better luck next time");
					gameOver = true;
				}
			}

		}
	}
	
	
//_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
	
	
	/**
	 * This will print the fibonacci sequence but I am still trying
	 * to get the text to wrap
	 */
	public void createArrayList()
	{
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);;

		int firVal = 0;
		int secVal = 1;
		for (int count = 0; count < 20; count +=1)
		{
			int nextVal = fib.get(firVal) + fib.get(secVal);
			fib.add(nextVal);
			firVal += 1;
			secVal += 1;
			count += 1;

		}
		
		JOptionPane.showMessageDialog(null, "This is the sequence" + (fib));
	}
	
	
//_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
	
	
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
