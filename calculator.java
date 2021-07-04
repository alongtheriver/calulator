package projects;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====================");
		
		System.out.println("Choose a number between 1 to 9");
		int num1 = scan.nextInt();
		
		System.out.println("Choose another number between 1 to 9");
		int num2 = scan.nextInt();
		
		System.out.println("Enter which operations: Addition (+), Subtraction (-), Division(/), or Multiplication (*)");
		String operation = scan.next();
		
		if (operation.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operation.equals("-")) {
			System.out.println(num1 - num2);
		} else if (operation.equals("/")) {
			System.out.println(num1 / num2);
		} else if (operation.equals("*")) {
			System.out.println(num1 * num2);
		} 
		
		System.out.println("=====================");
		
		scan.close();
		

	}

}
