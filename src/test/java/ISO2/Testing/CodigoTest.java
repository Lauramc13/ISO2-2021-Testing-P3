package ISO2.Testing;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CodigoTest {
	
	private Codigo c;
	private Main m;

	@Before
	public void setUp() throws Exception {
		c = new Codigo();
		m = new Main();
	}

	//TESTS DE ADECUACION FUNCIONAL
	@Test
	public void testAdecuacionFuncional() {
		assertEquals(-1, c.adecuacionFuncional(-5,-5,-5));
	}
	
	@Test
	public void testAdecuacionFuncional2() {
		assertEquals(0, c.adecuacionFuncional(7,8,5));
	}
	
	@Test
	public void testAdecuacionFuncional3() {
		assertEquals(1, c.adecuacionFuncional(10,10,10));
	}
	
	@Test
	public void testAdecuacionFuncional4() {
		assertEquals(2, c.adecuacionFuncional(50,50,50));
	}
	
	@Test
	public void testAdecuacionFuncional5() {
		assertEquals(3, c.adecuacionFuncional(70,70,70));
	}
	
	@Test
	public void testAdecuacionFuncional6() {
		assertEquals(4, c.adecuacionFuncional(99,95,96));
	}
	
	@Test
	public void testAdecuacionFuncional7() {
		assertEquals(-1, c.adecuacionFuncional(152,125,113));
	}
	
	//TESTS DE MANTENIBILIDAD
	@Test
	public void testMantenibilidad() {
		assertEquals(2, c.mantenibilidad(55,55,55,55,55));
	}
	
	@Test
	public void testMantenibilidad2() {
		assertEquals(-1, c.mantenibilidad(-5,-5,-5, -2, -3));	
	}
	
	@Test
	public void testMantenibilidad3() {
		assertEquals(0, c.mantenibilidad(7,8,5, 3, 9));	
	}
	
	@Test
	public void testMantenibilidad4() {
		assertEquals(0, c.mantenibilidad(12,12,12,12,12));	
	}
	
	@Test
	public void testMantenibilidad5() {
		assertEquals(1, c.mantenibilidad(38,38,38,38,38));
	}
	
	@Test
	public void testMantenibilidad6() {
		assertEquals(1, c.mantenibilidad(40,40,40,40,40));
	}
	
	@Test
	public void testMantenibilidad7() {
		assertEquals(3, c.mantenibilidad(75,75,75, 75, 75));
		
	}
	
	@Test
	public void testMantenibilidad8() {
		assertEquals(4, c.mantenibilidad(99,95,96, 92, 94));
	}
	
	@Test
	public void testMantenibilidad9() {
		assertEquals(-1, c.mantenibilidad(152,125,113, 150, 168));
	}

	// TEST DE CALIDAD GLOBAL	
	@Test
	public void testCalidadGlobal() {
		assertEquals(-1, c.calidadGlobal(0, 0));
	}
	
	@Test
	public void testCalidadGlobal2() {
		assertEquals(1, c.calidadGlobal(5, 1));
	}
	
	@Test
	public void testCalidadGlobal3() {
		assertEquals(1, c.calidadGlobal(1, 2));
	}
	
	@Test
	public void testCalidadGlobal4() {
		assertEquals(2, c.calidadGlobal(5, 2));
	}
	
	@Test
	public void testCalidadGlobal5() {
		assertEquals(2, c.calidadGlobal(1, 3));
	}
	
	@Test
	public void testCalidadGlobal6() {
		assertEquals(2, c.calidadGlobal(2, 3));
	}

	@Test
	public void testCalidadGlobal7() {
		assertEquals(3, c.calidadGlobal(5, 3));
	}

	@Test
	public void testCalidadGlobal8() {
		assertEquals(4, c.calidadGlobal(4, 4));
	}
	
	@Test
	public void testCalidadGlobal9() {
		assertEquals(4, c.calidadGlobal(5, 4));
	}
	
	@Test
	public void testCalidadGlobal10() {
		assertEquals(3, c.calidadGlobal(1, 5));
	}
	
	@Test
	public void testCalidadGlobal11() {
		assertEquals(3, c.calidadGlobal(2, 5));
	}
	
	@Test
	public void testCalidadGlobal12() {
		assertEquals(4, c.calidadGlobal(3, 5));
	}
	
	@Test
	public void testCalidadGlobal13() {
		assertEquals(4, c.calidadGlobal(4, 5));
	}
	
	@Test
	public void testCalidadGlobal14() {
		assertEquals(5, c.calidadGlobal(5, 5));
	}
	
	@Test
	public void testCalidadGlobal15() {
		assertEquals(-1, c.calidadGlobal(6, 5));
	}
	
	@Test
	public void testCalidadGlobal16() {
		assertEquals(-1, c.calidadGlobal(5, 6));
	}
	
	@Test
	public void testCalidadGlobal17() {
		assertEquals(-1, c.calidadGlobal(0, 4));
	}
	
	@Test
	public void testMain() {
		m.main(null);
	}
	
	
	
}
