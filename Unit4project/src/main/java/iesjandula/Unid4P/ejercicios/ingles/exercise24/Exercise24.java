package iesjandula.Unid4P.ejercicios.ingles.exercise24;

public class Exercise24 {

	
	private static int getNumEvenNumbersInArray(Integer[] array) {
		
		int contEven=0;
		
		for (Integer item: array) {
			
			if (item%2==0) {
				contEven++;
			}
		}
		
		return contEven;
	}
	
	public static Integer[] evenArray(Integer[] array1, Integer[] array2) {
		
		int contEven=0;
		
		int tamArrayRes = getNumEvenNumbersInArray(array1) +getNumEvenNumbersInArray(array2);
		Integer[] arrayResul = new Integer [tamArrayRes];
		
		
		for(Integer item: array1) {
			
			if (item%2==0) {
				
				arrayResul[contEven]=item;
				contEven++;
			}
		}
		
		for(Integer item: array2) {
					
					if (item%2==0) {
						
						arrayResul[contEven]=item;
						contEven++;
					}
				}
		
		return arrayResul;
	}
		
}
