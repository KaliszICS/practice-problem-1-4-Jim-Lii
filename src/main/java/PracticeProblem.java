/*
Lesson: Input
Author: Jim Li
Date Created: Feb. 17, 2026
Date Last Modified: Feb. 17, 2026
*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = input.nextLine();
		System.out.println(name);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a whole number: ");
		int num = input.nextInt();
		input.nextLine();
		System.out.println(num * 2 + 2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a radius: ");
		Double rad = input.nextDouble();
		input.nextLine();
		System.out.println(rad * 2 * 3.14);
		System.out.println(rad * rad * 3.14);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a first name: ");
		String firstName = input.nextLine();
		System.out.print("Input a last name: ");
		String lastName = input.nextLine();
		System.out.print("Input an age: ");
		int age = input.nextInt();
		input.nextLine();
		System.out.println(lastName + ", " + firstName + " - " + age);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a name: ");
		String name = input.nextLine();
		System.out.print("Input an age: ");
		int age = input.nextInt();
		input.nextLine();
		int iq = age;
		age += 3;
		System.out.println(name);
		System.out.print(age);
		System.out.println(iq);
	}

}
