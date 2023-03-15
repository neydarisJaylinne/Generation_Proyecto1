import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutoTest {
	public Auto auto = new Auto(null, null, 0, null, null, null, 0, 0, 0, null, 0, null);
	public Direccion direccion = new Direccion(null, null, null);
	public Marca marca = new Marca();
	public Propietario propietario = new Propietario(null, null, direccion);

	@Test
	void testSetModelo() {
		auto.setModelo("1999");
		assertTrue(auto.getModelo() == "1999");
	}

	@Test
	void testSetColor() {
		auto.setColor("1999");
		assertTrue(auto.getColor() == "1999");
	}

	@Test
	void testSetAño() {
		auto.setAño(1999);
		assertTrue(auto.getAño() == 1999);
	}

	@Test
	void testSetMarca() {
		auto.setMarca(marca);
		assertTrue(auto.getMarca() == marca);
	}

	@Test
	void testSetChasis() {
		auto.setChasis("1999");
		assertTrue(auto.getChasis() == "1999");
	}

	@Test
	void testSetPropietario() {
		auto.setPropietario(propietario);
		assertTrue(auto.getPropietario() == propietario);
	}

	@Test
	void testSetMaxVel() {
		auto.setMaxVel(1999);
		assertTrue(auto.getMaxVel() == 1999);
	}

	@Test
	void testSetActVel() {
		auto.setActVel(1999);
		assertTrue(auto.getActVel() == 1999);
	}

	@Test
	void testSetPuertos() {
		auto.setPuertos(5);
		assertTrue(auto.getPuertos() == 5);
	}

	@Test
	void testSetNumMarchas() {
		auto.setNumMarchas(5);
		assertTrue(auto.getNumMarchas() == 5);
	}

	@Test
	void testSetTransmisionAuto() {
		auto.setTransmisionAuto("1999");
		assertTrue(auto.getTransmisionAuto() == "1999");
	}

	@Test
	void testSetMarchaActual() {
		auto.setMarchaActual(1);
		assertTrue(auto.getMarchaActual() == 1);
	}

	@Test
	void testSetCombustible() {
		auto.setCombustible(1);
		assertTrue(auto.getCombustible() == 1);
	}

	@Test
	void testSetTechoSolar() {
		auto.setTechoSolar("1999");
		assertTrue(auto.getTechoSolar() == "1999");
	}

}
