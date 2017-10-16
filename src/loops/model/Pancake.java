package loops.model;

public class Pancake
{
	private String flavor;
	private String shape;
	private boolean sweet;
	private boolean toppingsSyrup;
	private int numFruits; 
	
	public Pancake()
	{
		this.flavor = "buttermilk";
		this.shape = "round";
		this.sweet = false;
		this.toppingsSyrup = false;
		this.numFruits = 0;
	}
	public Pancake(String flavor, String shape, int numFruits)
	{
		this();
		this.flavor = flavor;
		this.shape = shape;
		this.numFruits = numFruits;
	}
	
	public int getNumFruits()
	{
		return numFruits;
	}
	
	public void setNumFruits(int numFruits)
	{
		this.numFruits = numFruits;
	}
	
	public String getShape()
	{
		return shape;
	}
	
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
	
	public void setFlavor(String flavor)
	{
		this.flavor = flavor;
	}
	public String toString()
	{
		String description = "this pancake is a " + flavor + " also, has " + numFruits + " toppings.";
		return description;
	}
	public String toStrings()
	{
		String description = "I'm a  " + flavor + " pancake, with " + numFruits + " types of toppings.";
		return description;
	}
}
