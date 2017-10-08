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
}
