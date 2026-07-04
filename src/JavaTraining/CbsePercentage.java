package JavaTraining;

import java.util.Scanner;

public class CbsePercentage {

	public static void main(String[] args) {
		System.out.println("enter the marks of five subjects");
		Scanner sc = new Scanner(System.in);
		float total = 500;
		
		System.out.println("enter sub1");
		float a = sc.nextFloat();
		
		System.out.println("enter sub2");
		float b = sc.nextFloat();
		
		System.out.println("enter sub3");
		float c = sc.nextFloat();
		
		System.out.println("enter sub4");
		float d = sc.nextFloat();
		
		System.out.println("enter sub5");
		float e = sc.nextFloat();
		
		float sum = a + b + c + d + e;
		System.out.println("sum : " +sum);
		
		float precentage = (sum/total) *100;
		System.out.println("marks percentage is: " +  precentage +"%");
		

	}

}
