package loops.model;

public class Pancake
{
	private String flavor;
	private String shape;
	private boolean sweet;
	private boolean toppingsSyrup;
	private int numFruits; 
	
	private Pancake()
	{
		this.flavor = "buttermilk";
		this.shape = "round";
		this.sweet = false;
		this.toppingsSyrup = false;
		this.numFruits = 0;
	}
	public Pancake(String flavor, String shape)
	{
		this();
		this.flavor = flavor;
		this.shape = shape;
	}
	public String toString()
	{
		String description = "this pancake is a " + flavor + "and is a " + shape + "pancake.";
		return description;
	}
	
	
	
}
