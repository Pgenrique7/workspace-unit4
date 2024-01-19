package array;

import java.util.Locale;
import java.util.Random;

public class ArrayLiterales {
	
	
public static void pintarArrayEnteros (int [] array){
		
		for (int i=0; i<array.length; i++) {
			
		if (i==array.length-1) {
			
			System.out.format("|%-4d|",array[i]);
			
			}
		
		else {
			
			System.out.format("|%-4d",array[i]);
			
			}
		}
		
		System.out.println();

	}

	public static int [] creaArrayConNumerosAleatorios (int tam) {
		
		//puedo usar variable de tipo entero para asignar tamaño al array
		int [] array = new int [tam];
		
		tam=
				
		//devuelvo la referencia del array
		return array;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayDias= {1, 2, 3, 4, 5, 6, 7};
		
		int [] arrayDias2 = new int [4];
		
		pintarArrayEnteros(arrayDias);
		
		

	}

}
