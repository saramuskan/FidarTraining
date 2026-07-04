package JavaTraining;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Taking input from input");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number 1");
		int a = sc.nextInt();
		float c = sc.nextFloat();
		
		System.out.println("enter number 2");
		int b = sc.nextInt();
		float d = sc.nextFloat();
		
		int multi = a*b;
		float sum = c+d;
		
		System.out.println("multiplication of two numbers is  " +multi);
		System.out.println("sum of two numers is " +sum);
	}

}
