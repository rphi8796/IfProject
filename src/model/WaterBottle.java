package model;

public class WaterBottle
{
	private String color;
	private String lidType;
	private String material;
	private int fluidOz;
	private boolean insulated;
	
	
	/**
	 * Default constructor for a Run.
	 * Initializes all values to valid but "bad" values
	 * Used for later customization
	 */
	public WaterBottle()
	{
		this.color = "Grey";
		this.lidType = "Straw";
		this.material = "Metal";
		this.fluidOz = 40;
		this.insulated = true;
	}
	
	/**
	 * This constructor initializes a run instance with a value for the distance.
	 * @param color Describes the color of the water bottle
	 * @param lidType Describes the lid type, such as flat, straw, or sport
	 * @param material Describes the material it is made out of, either plastic or metal
	 * @param fluidOz Tells the fluid ounces inside the water bottle
	 * @param insulated Describes the water bottle as either insulated or not
	 */
	public WaterBottle(String color, String lidType, String material, int fluidOz, boolean insulated)
	{
		this.color = color;
		this.lidType = lidType;
		this.material = material;
		this.fluidOz = fluidOz;
		this.insulated = insulated;
		
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getLidType()
	{
		return lidType;
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	public int getFluidOz()
	{
		return fluidOz;
	}
	
	public boolean getInsulated()
	{
		return insulated;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setLidType(String lidType)
	{
		this.lidType = lidType;
	}
	
	public void setMaterial(String material)
	{
		this.material = material;
	}
	
	public void setFluidOz(int fluidOz)
	{
		this.fluidOz = fluidOz;
	}
	
	public void setinsulated(boolean insulated)
	{
		this.insulated = insulated;
	}
	
	
	
	
	
	
	
	
	
	
	
}

