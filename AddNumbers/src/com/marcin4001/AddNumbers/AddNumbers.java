package com.marcin4001.AddNumbers;

public class AddNumbers {

	public static int AddInt(int a, int b)
	{
		return a + b;
	}
	
	public static float AddFloat(float a, float b)
	{
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("Dodawanie zmirnnych typu int: ");
		int a = 1234;
		int b = 5678;
		int result = AddInt(a,b);
		System.out.println("wynik:" + result);
	}

}
