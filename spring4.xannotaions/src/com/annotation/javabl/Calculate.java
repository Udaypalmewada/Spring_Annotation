package com.annotation.javabl;

public class Calculate {
	private int a;
	private int b;
	private int sum;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void init()
	{
		System.out.println("sum is");
		sum=a+b;
	}
	public void destroy()
	{
		System.out.println("destroy method is called");
	}
	@Override
	public String toString() {
		return "Calculate [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}
}
