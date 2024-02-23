package iesjandula.Unid4P.ejercicios.eningles.exercise16_17_18_19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejemplosenclase.ArrayMetodos;

class exercise16_17Test {

	@Test
	void returnArrayWithPositivesTest() {
		
		Integer [] arrayInit = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		Integer[] arrayTest = Exercise16_17.returnArrayWithPositives(arrayInit);
		
		for(Integer item: arrayTest) {
			
			assertNotNull(item);
			assertTrue(item>0, "Item tiene que ser positivo");
		}
	}
		
}
