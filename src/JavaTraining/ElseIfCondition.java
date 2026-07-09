package JavaTraining;

import java.util.Scanner;

public class ElseIfCondition {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("elegible to vote");			
		}
		else if(age <= 18){
			System.out.println("not eligible to vote");
		}
		else {
			System.out.println("eligible to vote");
		}
		

	}

}
