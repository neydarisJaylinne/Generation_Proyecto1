import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testMain() {
		Main main = new Main();
		main.main(null);
		assertEquals("", "");
		
	}

	@Test
	void testMainError() {
		Main main = new Main();
		 Exception exception = assertThrows(IllegalArgumentException.class, ()->{
			 main.opciones();
		 });
		 
		Assertions.assertEquals("Something exception happened", exception.getMessage());
		
	}
}
