package com.sortmethod;

import java.util.Scanner;

public class SortMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The String Value :");
		String stringValue = scanner.nextLine();
		System.out.println("Enter The Size :");
		int size = scanner.nextInt();

		String[] array= new String[stringValue.length()+1-size];
		for (int i = 0; i <stringValue.length()+1-size; i++) {
			array[i]=stringValue.substring(i, i+size);
		}
		String temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i].charAt(0)>array[j].charAt(0)) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
