package com.vinit.java8.learn;

public class BasicLambdaExp2 {
	public static void main(String args[])
	{
		// First Java 8  features ..
		StringRunnable r = (temp) -> 
		{   
			System.out.println("Hello "+temp+"!!");
		};
		r.run("Vinit");
	}
	@FunctionalInterface
	public interface StringRunnable {
		public abstract void run(String s);
	}
}
