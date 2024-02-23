package iesjandula.Unid4P.array;

import java.util.Locale;
import java.util.Random;

public class ArrayLiterales {
	
	
public static void pintarArrayEnteros (int [] array, int numFinal){
		
		for (int i=0; i<array.length && array[i]!= numFinal; i++) {
			
		if (i==array.length-1) {
			
			System.out.format("|%-4d|",array[i]);
			
			}
		
		else {
			
			System.out.format("|%-4d",array[i]);
			
			}
		}
		
		System.out.println();

	}

public static void pintarArrayCadenas (String[] array) {
	
	for (int i=0; i<array.length; i++) {
		
		if (i==array.length-1) {
			
			System.out.format("|%-20s|",array[i]);
			
			}
		
		else {
			
			System.out.format("|%-20s",array[i]);
			
			}
		}
		
		System.out.println();

	}


	public static int creaArrayConNumerosAleatorios (int tam) {
		
		//puedo usar variable de tipo entero para asignar tamaño al array
		int [] array = new int [tam];
		
				
		//devuelvo la referencia del array
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayDias= {1, 2, 3, 4, 5, 6, 7};
		
		int [] arrayDias2 = new int [4];
		
		pintarArrayEnteros(arrayDias,0);
		
		

	}

}
