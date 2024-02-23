package iesjandula.Unid4P.ejercicios;

import java.util.Scanner;

import array.ArrayLiterales;

public class ejercicio_6 {

	
	public static int [] Leer10yguardarEnArray (int[] array) {
		
		int [] arr= new int [10];
		Scanner sc= new Scanner (System.in);
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.println("Introduce un número");
			
			arr[i]= sc.nextInt();
		}
		
		
		ArrayLiterales.pintarArrayEnteros(arr,0);
		
		
		return array;
	}
	
	public static int[] leerNyGuardarEnArray (int n) {
		
		int [] arr = new int[n];
		
		Scanner sc= new Scanner (System.in);
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.println("Introduce un número");
			
			arr[i]= sc.nextInt();
		}
		
		
		ArrayLiterales.pintarArrayEnteros(arr,0);
		
		
		
		return arr;
	}
	
	
	public static int [] leerNyGuardarParesEnArray (int n) {
		
		int [] arr = new int [n];
		int posicion=0;
		int num=0;
		
		Scanner sc= new Scanner (System.in);
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.println("Introduce un número");
			
			num= sc.nextInt();
			
			if (num %2==0) {
				
				arr[posicion]=num;
				posicion++;
				
			}
		}
		
		
		ArrayLiterales.pintarArrayEnteros(arr,0);
		
		return arr;
		
		
	}
	
	
	
	public static String[] leerArray(int n) {
		
		Scanner sc=  new Scanner (System.in);
	
		
		String [] arr = new String[n];
		

		for (int i=0; i<arr.length; i++) {
			
			System.out.println("Introduce un nombre");
			arr[i]=sc.nextLine();		
		
		}
		
		ArrayLiterales.pintarArrayCadenas(arr);
		
		return arr;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);

		int n;
		
		//Leer10yguardarEnArray(null);
		
		
		//System.out.println("Dime el con el que quieres hacer el siguiente array");
		
		//n=sc.nextInt();
		
		//leerNyGuardarEnArray(n);
		
		
		//leerNyGuardarParesEnArray(4);
		
		
		leerArray(4);
		
	
				
	}

}
