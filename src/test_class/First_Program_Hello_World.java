package test_class;

import java.util.Scanner;

public class First_Program_Hello_World {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello! Please, what's your name?");
		String name = sc.next();
		System.out.println("Welcome " + name + " for a java review!");
		sc.close();
	}
}
