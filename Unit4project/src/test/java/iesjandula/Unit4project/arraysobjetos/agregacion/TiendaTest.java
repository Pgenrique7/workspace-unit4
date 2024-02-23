package iesjandula.Unit4project.arraysobjetos.agregacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	
	private Cliente mockClient;
	private Tienda mockTienda;

	@BeforeEach
	void setup() {
		

		mockClient = new Cliente ("Jesus", "Soto", "444444");
		
		mockTienda = new Tienda ("Software J&P", "C. san Vicente Paul,23,23740,Andujar,Jaén");

		
	}
	
	@Test
	void addClienteTest() {
		
		mockTienda.addCliente(mockClient);
		
	}

	@Test
	void borrarClienteTest() {
		
		mockTienda.addCliente(mockClient);
		
		mockTienda.borrarCliente(mockClient);
		
		for(Cliente cliente: mockTienda.getClientes()) {
			
			assertNotEquals(cliente, mockClient);
			
		}
		
	}
	
}
