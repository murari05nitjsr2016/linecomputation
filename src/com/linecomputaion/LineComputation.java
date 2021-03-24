package com.linecomputaion;
import java.util.Scanner;
public class LineComputation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2;
		System.out.println("enter 1st line co-ordinate");						
		System.out.println("enter x1 point");
		x1=sc.nextInt();
		System.out.println("enter y1 point");
		y1=sc.nextInt();
		System.out.println("enter x2point");
		x2=sc.nextInt();
		System.out.println("enter y2 point");
		y2=sc.nextInt();
		Integer disOfLine1=(int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		int x3,x4,y3,y4;
		System.out.println("enter 2nd line co-ordinate");						
		System.out.println("enter x3 point");
		x3=sc.nextInt();
		System.out.println("enter y3 point");
		y3=sc.nextInt();
		System.out.println("enter x4point");
		x4=sc.nextInt();
		System.out.println("enter y4 point");
		y4=sc.nextInt();
		Integer disOfLine2=(int)Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));
		int compResult = disOfLine1.compareTo(disOfLine2);
		if(compResult > 0)
		{
			System.out.println("1st line ig greater than second line");
		}
		else if(compResult == 0)
		{
			System.out.println("both lines are equal");
		}
		else if(compResult < 0)
		{
			System.out.println("1st line ig less than second line");
		}
	}

}

