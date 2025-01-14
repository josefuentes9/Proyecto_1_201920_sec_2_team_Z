package test.data_structures;

import model.data_structures.DoubleLinkedList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDoubleLinkedList {

	private DoubleLinkedList<String> arreglo;
	private static int TAMANO=100;

	@Before
	public void setUp1() {
		arreglo= new DoubleLinkedList<String>();
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testDoubleLinkedListVacio() {
		assertTrue(arreglo!=null);
		assertEquals(0, arreglo.size());
		assertEquals(TAMANO, arreglo.size());
	}

	@Test
	public void testDoubleLinkedListAgregar()
	{
		setUp1();
		arreglo.agregar("Hola");
		assertEquals(1, arreglo.size());
		assertEquals("Hola", equals(arreglo.get(0)));
	}

	@Test
	public void testDarElemento() {
		setUp2();
		assertEquals("0", arreglo.agregar("hola"));
		assertEquals(""+TAMANO, arreglo.get(0));
		assertEquals(""+(TAMANO*2-1), arreglo.get(TAMANO*2-1));
	}


}
