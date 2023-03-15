import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DireccionTest {
	public Direccion direccion = new Direccion(null, null, null);
	
	@Test
	void testSetCalle() {
		direccion.setCalle("1999");
		assertTrue(direccion.getCalle() == "1999");
	}

	@Test
	void testSetBarrio() {
		direccion.setBarrio("1999");
		assertTrue(direccion.getBarrio() == "1999");
	}

	@Test
	void testSetCiudad() {
		direccion.setCiudad("1999");
		assertTrue(direccion.getCiudad() == "1999");
	}

}
