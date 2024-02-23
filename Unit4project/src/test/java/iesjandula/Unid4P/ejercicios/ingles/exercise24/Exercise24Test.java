package iesjandula.Unid4P.ejercicios.ingles.exercise24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejemplosenclase.ArrayMetodos;
import iesjandula.Unid4P.ejercicios.eningles.exercise16_17_18_19.Exercise16_17;

class Exercise24Test {

	@Test
	void evenArrayTest() {
		
		//necesito dos arrays enteros
		//ejecutar el metodo evenArray con esos dos arrays pasados como parametro
		// al arrayREsultado le debo hacer:
		
		//comprobar que no tienen nulos
		//comprobar que cada numero es par
		
		
			
			Integer [] arrayInit = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
			
			Integer [] arrayInit1 = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
			
			Integer[] arrayTest= Exercise24.evenArray(arrayInit, arrayInit1);
			
			for(Integer item: arrayTest) {
				
				assertNotNull(item);
				assertTrue(item%2==0, "Item tiene que ser par");
			}
		
		
	}

}
