package com.accenture.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Demostracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		final String MES_5 = "Mayo";
		int numero1 = 23;
		int numero2;
		int resultado;
		boolean esVaron;
		int[] numeros = new int[5];
		String[] series = new String[3];
		String month= "Mayo";
		int [] pedirNumero = new int[10];
		
		// int res2;
		
		numeros[0]= 24;
		numeros[1]= 29;
		numeros[2]= 21;
		numeros[3]= 42;
		numeros[4]= 72;
		
		series[0] = "House of Cards";
		series[1]= "Lost";
		series[2]= "Breaking Bad";
		
		
		
		
		
		
		String[] apps = new String[5];
		
		apps[0]= "Spotify";
		apps[1]= "Netflix";
		apps[2]= "Snapchat";
		apps[3]= "Instagram";
		apps[4]= "Facebook";
		
		
		for(int i=0; apps.length > i; i++) {
			System.out.println(apps[i]);
		}
		
		
		System.out.println("-------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nom = sc.nextLine();
		System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();
		
		System.out.println("Hola " +nom + " Tu edad es: " + edad);
		
		
		
		switch (month) {
		case "Mayo":
			System.out.println("Mayo");
			break;
		case "Enero":
			System.out.println("Enero");
			break;
		case "Abril":
			System.out.println("Abril");
			break;
			
		}
		
		
		
		int contw= 0;
		while (contw<8) {
			System.out.println("Repeat");
			
			contw++;
		}
		
		
		
		ArrayList<String> appList = new ArrayList<String>();
		
		System.out.println("-----ArrayList-----");
		
		// appList = new ArrayList<String>();
		
		appList.add("Fotos");
		appList.add("Notas");
		appList.add("WhatsApp");
		
		System.out.println("Lista de aplicaciones:" + appList.get(0));
		
		// System.out.println("");
		
		for(String app: appList) {
			System.out.println("App:" + app);
		}
		
		
		
		
		Scanner num = new Scanner(System.in);
		System.out(System.println)
		
		/* if (num) {
			
			System.out.println("Es un numero par.");
		}
		else {
			
			System.out.print("Es un numero impar.");
		}
			;
			*/
		
		
		
		
		
		System.out.println("Hola mundo!");
		nombre = "Francisco";
		System.out.println("El nombre es: " + nombre + "." + " "
		+ "Es un lindo nombre y nacio en: " + MES_5);
		
	}
		
}