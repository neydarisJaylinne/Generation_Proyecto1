import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarcaTest {

	Marca marca = new Marca();

	@Test
	void testSetNombre() {
		marca.setNombre("1999");
		assertTrue(marca.getNombre() == "1999");
	}

	@Test
	void testSetNrModelo() {
		marca.setNrModelo(1999);
		assertTrue(marca.getNrModelo() == 1999);
	}

	@Test
	void testSetAñoLanzamiento() {
		marca.setAñoLanzamiento(1999);
		assertTrue(marca.getAñoLanzamiento() == 1999);
	}

	@Test
	void testSetId() {
		marca.setId("1999");
		assertTrue(marca.getId() == "1999");
	}

}
