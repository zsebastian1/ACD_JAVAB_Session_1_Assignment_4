package ACADAssignments;

import java.util.Scanner;

public class Assignment1_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your value for byte");
		byte b = input.nextByte();
		System.out.println("Enter your value for short");
		short s = input.nextShort();
		
		int i = b + s;
		long l = s + i;
		float f = i + l;
		double d = l + f;
		
		System.out.println("The added sums of each value are as follows: \n The value for int is: " + i + "\n The value for long is: " + l + "\n The value for float is: " + f + "\n The value for double is: " + d);
	}
}
