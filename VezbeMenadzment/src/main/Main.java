package main;

import java.util.HashMap;
import java.util.Map;

import geometry.Circle;
import geometry.Line;
import geometry.Point;

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
		
//		for(int godina = 2023; godina <=2100; godina += 4) {
//			if(godina == 2023) {
//				godina++;
//			}else if (godina%100 == 0) {
//				if(godina%400 ==0) {
//					System.out.println(godina);
//				}else {
//					continue;
//				}
//			}
//			System.out.println(godina);
//		}
		
		// VEZBE 3 - Osnovne objektnog programiranja
		int broj = 20;
		//System.out.println(broj);
//		Point p1 = new Point();
		//System.out.println("Vrednost reference: " + p1);
		//System.out.println("Vrednost atributa x objekta na koji pokazuje p1: " + p1.getX());
		//System.out.println("Vrednost atributa y objekta na koji pokazuje p1: " + p1.getY());
		//System.out.println("Vrednost atributa selected objekta na koji pokazuje p1: " 
		//+ p1.isSelected());
		
//		p1.setX(20);
//		p1.setY(10);
//		//System.out.println(p1.getX());
//		Point p2 = new Point();
//		p2.setX(10);
//		p2.setY(10);
//		double udaljenost = p1.distance(p2);
//		//System.out.println("Udaljenost je: " + udaljenost);
//		p2.setX(50);
//		//System.out.println(p1.getX());
//		p1.setY(200);
		//System.out.println(p2.getY());
		
		//p1 -> x(0), y(0), selected(false) objekat 1
		//p2 -> x(0), y(0), selected(false) objekat 2
		//p1=p2 -> objekat 2
		//p2.setX(50) -> x(50), y(0), selected(false) objekat 2
		//p1.setY(200) -> x(50), y(200), selected(false) objekat 2
		
		//Vezbe 4
//		System.out.println("X vrednost objekta na koji pokazuje p1: " + p1.getX());
//		System.out.println("X vrednost objekta na koji pokazuje p2: " + p2.getX());
//		Line l1 = new Line();
//		l1.setStartPoint(p1);
//		p1 = p2;
//		System.out.println("X vrednost objekta na koji pokazuje p1: " + p1.getX());
//		System.out.println("X vrednost objekta na koji pokazuje p2: " + p2.getX());
//		System.out.println("X vrednost objekta na koji startPoint: " + l1.getStartPoint().getX());
//		
//		Rectangle r1 = new Rectangle();
//		Circle c1 = new Circle();
//		
//		System.out.println("Povrsina pravougaonika r1 je: " + r1.area());
//		System.out.println("Povrsina pravougaonika c1 je: " + c1.area());
//		
//		System.out.println(l1.getStartPoint().getY() * c1.getRadius());
		
		
		//System.out.println(l1.length());
		
		//VEZBE 5 - Klasa Object i overriding
		Point p1 = new Point(10,10);
		//System.out.println("Izvrsavanje metode toString() " + p1.toString());
		//System.out.println("Vrednost reference " + p1);
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(new Point(15,15));
		//System.out.println("Vrednost reference " + l1);
		Point p2 = new Point(10,10);
		p1 = p2; //p1 pokazuje na isti objekat kao i p2
		//System.out.println(p1 == p2);
		//Object o = new Point(10,10); Tip reference ne mora da bude isti kao tip objekta
		
		//System.out.println(Moveable.BROJ);
		// Vezbe 7
		
		Circle c1 = new Circle(p1, 50);
		Circle c2 = new Circle(p2, 60);
		//System.out.println(c1.compareTo(l1));
		
		//Vezbe 8
		
//		int[] nizBrojeva = new int[5];
//		nizBrojeva[0] = 4;
//		nizBrojeva[1] = 5;
//		nizBrojeva[2] = 6;
//		nizBrojeva[3] = 7;
//		nizBrojeva[4] = 8;
		int[] nizBrojeva = {4,5,6,7,8};
		for(int i = nizBrojeva.length-1; i>=0; i--) {
			
			//System.out.println("Vrednost elementa na indeksu " + i + " je: " + nizBrojeva[i]);
		}
		
		HashMap<String,String> mapa = new HashMap<String,String>();
		mapa.put("txt", "notepad.exe");
		mapa.put("dib", "paint.exe");
		mapa.put("bmp", "paint.exe");
		mapa.put("rtf", "wordpad.exe");
		
		mapa.replace("rtf", "windword.exe");
		mapa.put("rtf", "wordpad.exe");
		
		if(!mapa.containsKey("tif")) {
			System.out.println("Kljuc tif nije pronadjen!");
		}
		
		if(!mapa.containsKey("ht")) {
			mapa.put("ht", "hypertrm.exe");
			System.out.println("Novi key-value par ht:hypertrm.exe je dodat!");
		}
		
		for(Map.Entry<String, String> es : mapa.entrySet()) {
			System.out.println(es);
		}
		
		if(mapa.containsKey("doc")) {
			mapa.remove("doc");
		}else {
			System.out.println("Kljuc doc nije pronadjen!");
		}
		
		
		
	}

}
