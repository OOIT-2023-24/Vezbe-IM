package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		int broj = 20;
//		double decimalni = 20.0;
//		char c = 'c';
//		String abc = "abc";
//		boolean check = true;
		
		//ARITMETICKE OPERACIJE - Primer 1
		
//		System.out.println("Unesite operaciju");
//		Scanner scanner = new Scanner(System.in);
//		char operacija = scanner.next().charAt(0);
//		
//		if(operacija == '+') {
//			System.out.println(24+12);
//		}else if(operacija == '-') {
//			System.out.println(24-12);
//		}else if(operacija == '*') {
//			System.out.println(24*12);
//		}else if(operacija == '/') {
//			System.out.println(24/12);
//		}else {
//			System.out.println
//			("Uneli ste nepoznatu operaciju");
//		}
		
		//FOR PETLJA
//		for(int i = 1; i <= 10; i = i + 1) {
//			System.out.println(i);
//		}
		
		// WHILE PETLJA
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		//DO WHILE PETLJA
//		int brojac = 50;
//		do {
//			System.out.println(brojac);
//			brojac++;
//		}while(brojac<=10);
//		System.out.println(brojac);
		
		//ZADATAK 1 - Zbir parnih brojeva od 0 do x
//		System.out.println("Unesite broj od 1 do 200");
//		Scanner scanner = new Scanner(System.in);
//		int broj = scanner.nextInt();
//		
//		int zbir = 0;
//		if(broj <= 200) {
//			for(int i=0; i<=broj; i = i + 2) {
//				zbir = zbir + i;
//			}
//		}else {
//			System.out.println("Unet je nevalidan broj");
//		}
//		System.out.println(zbir);
		
		// ZADATAK 2 - Prestupne godine
		
		for(int godina = 2023; godina <=2100; godina += 4) {
			if(godina == 2023) {
				godina++;
			}else if (godina%100 == 0) {
				if(godina%400 ==0) {
					System.out.println(godina);
				}else {
					continue;
				}
			}
			System.out.println(godina);
		}
		

	}

}
