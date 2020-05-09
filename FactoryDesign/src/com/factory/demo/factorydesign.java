package com.factory.demo;

public class factorydesign {
//step 4 :we can create other class 
	public static void main(String[] args)
	{
		shapefactory sf=new shapefactory();		
		shape shape1=sf.getshape("CIRCLE");
		shape1.draw();
		shape shape2=sf.getshape("Rectangle");
		shape2.draw();
		//get  an object of square and call its draw method .
		shape shape3=sf.getshape("Square");
		shape3.draw();
		
		// TODO Auto-generated method stub

	}

}
