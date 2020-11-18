package com.geometryPointCompare;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static double acceptPoint() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point X1");
		int x1=input.nextInt();
		System.out.println("Enter point Y1");
		int y1=input.nextInt();
		System.out.println("Enter point X2");
		int x2=input.nextInt();
		System.out.println("Enter point Y2");
		int y2=input.nextInt();
		double length=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		input.close();
		return length;
	}
	public static void main( String[] args )
	{
		System.out.println( "---------------welcome----------------" );
		double[] lineLength = new double[2];
		lineLength[0] = acceptPoint();   
		System.out.println("Line lenght : "+lineLength[0]);     
	}
}
