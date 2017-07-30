package org.Exercise1;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, type your name: ");
		name = sc.nextLine();
		System.out.println("Hello " + name + "!!");
	}
  }

