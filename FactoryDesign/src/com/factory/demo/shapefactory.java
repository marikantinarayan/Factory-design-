package com.factory.demo;

public class shapefactory
{
	// step 3:we can create shapefactory class 
	//use the getshape method to get object of type shape
	public shape getshape(String shapetype)
	{
		if (shapetype==null)
		{
			return null;
		}
		if (shapetype.equalsIgnoreCase("CIRCLE")) 
		{
			return new Circle();
		}
		else if (shapetype.equalsIgnoreCase("Rectangle")) 
		{
			return new Rectangle();
		}
		else if (shapetype.equalsIgnoreCase("Square")) 
		{
			return new Square();
		}
		
		return null;
	}

}
