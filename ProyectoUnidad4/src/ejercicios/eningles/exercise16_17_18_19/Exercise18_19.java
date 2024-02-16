package ejercicios.eningles.exercise16_17_18_19;

import ejemplosenclase.ArrayMetodos;

public class Exercise18_19 {

	   private static int numberOfPositivesInArray(Integer[]arrayParam) {
	        
	        int cont= 0;
	        
	        for (Integer num: arrayParam) {
	            if (num>0)
	                cont++;
	        }
	        
	        
	        return cont;
	    }
	    
	    private static int numberOfNegativesInArray(Integer[]arrayParam) {
	        
	        
	        
	        return 0;
	    }
	    
	    
	    public static Integer[] returnArrayWithPositives(Integer[]arrayParam) {
	        
	        Integer[] arrayRes = new Integer[numberOfPositivesInArray(arrayParam)];
	        int cont = 0;
	        
	        for ( int i = 0; i < arrayParam.length; i++) {
	            
	            if (arrayParam[i] > 0) {
	                
	                arrayRes[cont] = arrayParam[i];
	                cont++;
	                
	            }
	            
	        }
	        
	        
	        return arrayRes;
	        
	        
	    }
	    
	    public static Integer[] returnArrayWithNegatives(Integer[]arrayParam) {
	        
	        Integer[] arrayRes = new Integer[numberOfNegativesInArray(arrayParam)];
	        int cont = 0;
	        
	        for ( int i = 0; i < arrayParam.length; i++) {
	            
	            if (arrayParam[i] < 0) {
	                
	                arrayRes[cont] = arrayParam[i];
	                cont++;
	            }
	            
	        }
	        return arrayRes;
	        
	        
	    }
	    
	    public static Integer sumPositiveNumbers (Integer[] arrayParam) {
	    	
	    	Integer suma=0;
	    	
	    	for(Integer num: arrayParam) {
	    		
	    		suma+=num;
	    	}
	    	
	    	return suma;
	    	
	    }
	    
    public static Integer sumNegativeNumbers (Integer[] arrayParam) {
	    	
	    	Integer suma=0;
	    	
	    	for(Integer num: arrayParam) {
	    		
	    		suma+=num;
	    	}
	    	
	    	return suma;
	    	
	    }
	    
	    
	    
	    
	    public static void main(String[] args) {
	    

	        Integer[] arrayInt = ArrayMetodos.rellenaArrayAleatoriosWrap(20, -50 ,50);
	        
	        ArrayMetodos.mostrarArray(arrayInt);
	        
	        Integer[]arrayRes = returnArrayWithPositives(arrayInt);
	        
	        ArrayMetodos.mostrarArray(arrayRes);
	        
	        sumPositiveNumbers(arrayInt);
	        
	        
	    }

	
}
