import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropietarioTest {

	Propietario propietario = new Propietario(null, null, null);
	Direccion direccion = new Direccion(null, null, null);
	@Test
	void testSetNombre() {
		propietario.setNombre("1999");
		assertTrue(propietario.getNombre() == "1999");
	}

	@Test
	void testSetNacimiento() {
		propietario.setNacimiento("1999");
		assertTrue(propietario.getNacimiento() == "1999");	}

	@Test
	void testSetDireccion() {
		propietario.setDireccion(direccion);
		assertTrue(propietario.getDireccion() == direccion);
	}

}
