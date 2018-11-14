package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {
//	Suma s = new Suma(3,6);
//	Suma s;
	@Test
	void testSuma() {
//		int suma = s.hacerSuma(4,5);
		assertEquals(9,Suma.hacerSuma(3,6));
	}

}
