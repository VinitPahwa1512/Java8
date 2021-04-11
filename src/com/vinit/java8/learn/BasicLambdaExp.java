package com.vinit.java8.learn;

public class BasicLambdaExp {

	public static void main(String args[])
	{
		Runnable r = () -> 
		{   String name ="Vinit";
			System.out.println("Hello "+name+"!!");
		};
		r.run();
	}
}
