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
		display.displayText("hello");
		Pancake sample = new Pancake();
		display.displayText(sample.toString());
		
		interactingWithPancake();
	}
	
	private void showTheList()
	{
		
	}
	
	private void fillTheList()
	{
		
	}
	private void interactingWithPancake()
	{
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
}
