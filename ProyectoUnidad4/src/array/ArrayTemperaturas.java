package array;

import java.util.Locale;





public class ArrayTemperaturas {
	
	
	public static void pintarArray (double [] array){
		
		for (int i=0; i<array.length; i++) {
			
		if (i==array.length-1) {
			
			System.out.format(Locale.ENGLISH,"|%-4.2f|",array[i]);
			
			}
		
		else {
			
			System.out.format(Locale.ENGLISH,"|%-4.2f",array[i]);
			
			}
		}
		
		System.out.println();

	}
		
	
	public static void rellenarConUnos (double [] array){
		
		for (int i=0; i<array.length; i++) {
			
			array[i]=1.0 ;
			
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double [] temperatures = new double [20];
		
		System.out.println("La longitud del array es siempre una mas que el indice "+ temperatures.length);
		
		pintarArray(temperatures);
		
		rellenarConUnos(temperatures);
		
		pintarArray(temperatures);
		
	}
}
