package useful.controller;

import view.display.PopupDisplay;
import loops.model.Pancake;
import java.util.List;
import java.util.ArrayList;

public class UsefulController
{
	private List<Pancake> pancakeList;
	private PopupDisplay display;
	
	
	public UsefulController()
	{
		pancakeList = new ArrayList<Pancake>();
		display = new PopupDisplay();
		
	}
	public void start()
	{
		display.displayText("Hello, my name is Mr.Fluff, I'm a pancake.");
		Pancake sample = new Pancake();
		display.displayText(sample.toStrings() + " I'm a plain pancake.");
		
		interactingWithPancake(sample);
		fillTheList();
		showTheList();
		tryingForEach();
	}
	
	private void showTheList()
	{
		//display.displayText("The start of the best Flavor.");
		
		String favorite = "Strawberry flavor";
		for (int flavor = 0; flavor < pancakeList.size(); flavor++)
		{
			String currentFlavor = pancakeList.get(flavor).getFlavor();
			
			Pancake currentPancake = pancakeList.get(flavor);
			String index = currentPancake.getFlavor();
			
			if (currentFlavor.equals(favorite))
			{
				for( int woop = 1; woop < 2; woop += 1)
				{
					display.displayText("The best Flavor for a pancake Ever!!");
				}
			}
			display.displayText(pancakeList.get(flavor).toString());
		}
	}
	
	private void fillTheList()
	{
		Pancake strawberryFlavor = new Pancake("Strawberry flavor", "round", 1);
		Pancake bananaFlavor = new Pancake("Bannana Flavored", "round", 1);
		Pancake chocolateFlavor = new Pancake("Chocolate Flavored", "round", 1);
		
		pancakeList.add(strawberryFlavor);
		pancakeList.add(chocolateFlavor);
		pancakeList.add(bananaFlavor);
	}
	private void interactingWithPancake(Pancake currentPancake)
	{
		
		display.displayText("The start of interacting with Mr.Fluff.");
		
		String favPancake = display.getResponse("Mr.Fluff wants to know what flavor of pancake you like?");
		display.displayText("You like " + favPancake + " pancake!!");
		display.displayText("Now, Mr.Fluff wants you to make your own pancake!!");
		
		int specialAnswer = 0;
		String numOfPancake = display.getResponse("How many pancakes do you want?");
		while(!isValidInteger(numOfPancake))
		{
			display.displayText("Wrong, Try Again!");
			numOfPancake = display.getResponse("How many pancakes?");
		}
		specialAnswer = Integer.parseInt(numOfPancake);
		int numPan = 0;
		numPan = specialAnswer;
		
		if(numPan < 0)
		{
			display.displayText("You can't put negative numbers, silly person.");
		}
		
		if(numPan == 0)
		{
			display.displayText("You don't want Pancakes.");
			boolean yesOrNo = false;
			String answer = display.getResponse("Do you want to cancel the program? ( True or False )");
			
			while(!isValidBoolean(answer))
			{
				display.displayText("wrong, yet again! try again");
				answer = display.getResponse("True or false, pick one !!");
			}
			
			yesOrNo = Boolean.parseBoolean(answer);
			boolean yep = false;
			yep = yesOrNo;
			
			if (yep == true)
			{
				System.exit(numPan);
			}
			
		}
		else
		{
			display.displayText("You want " + numPan + " of pancakes.");
		}
		
		
		String flavorOfPancake = display.getResponse("What flavor do you want your Pancake to be??");
		display.displayText("You want all " + numOfPancake + " pancakes to be " + flavorOfPancake);
		
		int numTops = 0;
		String toppingPancake = display.getResponse("How many toppings do you want?");
		while(!isValidInteger(toppingPancake))
		{
			display.displayText("Try again!");
			toppingPancake = display.getResponse("How many toppings");
		}
		numTops = Integer.parseInt(toppingPancake);
		int tops = 0;
		tops = numTops;
		
		if (tops < 0)
		{
			display.displayText("you can't have a negative amount silly");
		}
		else if (tops == 0)
		{
			display.displayText("You don't like toppings, me too.");
		}
		else
		{
			currentPancake.setNumFruits(currentPancake.getNumFruits());
			display.displayText("Thank you now you have " + numOfPancake + " pancakes that are " + flavorOfPancake + " with " + toppingPancake + " toppings");	
		}
		
		
	}
	public void tryingForEach()
	{
		display.displayText("The start of listing flavors, and toppings.");
		String [] flavors = {"Strawberry", "Blueberry", "Chocolate", "Banana" };
		for(String flavor : flavors) // my Favorite Because its the easiest to use!!!
		{
			display.displayText("The pancakes " + flavor + " .");
		}
		
		String [] topings = {"banana", "syrup","frosting", "blueberris"};
		for(String tops : topings)
		{
			display.displayText("Toppings that go on a Pancake, " + tops + ".");
		}
	}
	//helper methods
	private boolean isValidInteger(String waffle)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(waffle);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			display.displayText("Only integervalues are valid: " + waffle + "is not valid");
		}
		
		return valid;
	}
	
	private boolean isValidBoolean(String waffle)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(waffle);
			valid = true;
			
		}
		catch(NumberFormatException error)
		{
			display.displayText("only Yes or NO. Not " + waffle );
		}
		return valid;
	}
}
