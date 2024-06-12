package com.rakesh;
//one class want to talk another class of method
//we achieve this by inheritance
//problem is class is tightly coupled.
public class Car extends Engine {
	
	public void drive()
	{
		int start = super.start();
		if(start>=1)
		{
			System.out.println("car started.");
		}else {
			System.out.println("some bad error");
		}
	}
	

}
