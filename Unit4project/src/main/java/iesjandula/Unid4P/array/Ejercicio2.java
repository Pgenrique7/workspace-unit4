package iesjandula.Unid4P.array;

import java.util.Locale;

public class Ejercicio2 {
	
	public static void pintarArray (int [] array){
		
		for (int i=0; i<array.length; i++) {
			
		if (i==array.length-1) {
			
			System.out.format("|%4d|",array[i]);
			
			}
		
		else {
			
			System.out.format("|%4d",array[i]);
			
			}
		}
		
		System.out.println();

	}
	
	public static void pintarArray (String [] array){
		
		for (int i=0; i<array.length; i++) {
			
		if (i==array.length-1) {
			
			System.out.format("|%4d|",array[i]);
			
			}
		
		else {
			
			System.out.format("|%4d",array[i]);
			
			}
		}
		
		System.out.println();

	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numerosEnteros = new int [12];
		
		
		numerosEnteros[0]=39;
		numerosEnteros[1]=-2;
		numerosEnteros[4]=0;
		numerosEnteros[6]=14;
		numerosEnteros[8]=5;
		numerosEnteros[9]=120;
		
		pintarArray(numerosEnteros);
		
		
		String [] caracteres = new String[10];
		
		caracteres[0]="a";
		caracteres[1]="x";
		caracteres[4]="a";
		caracteres[6]="";
		caracteres[7]="+";
		caracteres[8]="Q";
		
		pintarArray(caracteres);
		

	}

}
