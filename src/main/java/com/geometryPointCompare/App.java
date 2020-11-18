package com.geometryPointCompare;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner input = new Scanner(System.in);
	static double acceptPoint(int i) {
		System.out.println("Accepting "+(i+1)+" Line co-ordinate point");
		System.out.println("Enter point X1");
		int x1=input.nextInt();
		System.out.println("Enter point Y1");
		int y1=input.nextInt();
		System.out.println("Enter point X2");
		int x2=input.nextInt();
		System.out.println("Enter point Y2");
		int y2=input.nextInt();
		double length=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		return length;
	}
	static void checkLenght() {
		Double[] lineLength = new Double[2];
		for(int i=0;i<2;i++) {
			lineLength[i] = acceptPoint(i);
		}
		for(int i=0;i<2;i++) {
			System.out.println((i+1)+" Line lenght : "+lineLength[i]);			
		}
		boolean True = lineLength[0].equals(lineLength[1]);
		if(True) {
			System.out.println("1 & 2 lines are equal");
		}
		else {
			System.out.println("1 & 2 lines are not equal");
			checkGreaterLine(lineLength);
		}
	}
	static void checkGreaterLine(Double [] lineLength) {
		if(lineLength[0]>lineLength[1]) {
			System.out.println("Line 1 is Grater than Line 2");
		}
		else {
			System.out.println("Line 2 is Grater than Line 1");
		}
	}
	public static void main( String[] args )	{
		System.out.println( "---------------welcome----------------" );
		checkLenght();
	}
}
