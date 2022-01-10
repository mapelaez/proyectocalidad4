package com.calidad4.proyectocalidad;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ProyectocalidadApplicationTests {

	protected String[] propietariosAnteriores1 = {"Pedro Gomez","Julian Arganda"};
	protected String[] propietariosAnteriores2 = {"Sofia Fernandez","Ruben Quijano"};
	protected Propiedad p1 = new Propiedad("0","Avenida de la Paz, Portal 1, 1B", 192000.00f, 76, 2, 1,false,propietariosAnteriores1);
	protected Propiedad p2 = new Propiedad("1","Parque Santa Maria, Portal 2, 2C",300000.00f,110,3,2,true,propietariosAnteriores2);
	

	
	
	public void testJunit() {
	
    //Check that two objects are equal
	sonIguales();
	
	//Check that a condition is true
	esVerdadero();
	
	//Check that a condition is false
	esFalso();
	
	//Check that an object isn't null
	noNulo();
	
	//Check that an object is null
	esNulo();
	
	//Check if two object references point to the same object
	referenciaMismoObjeto();
	
	//Check if two object references not point to the same object
	referenciaDistintoObjeto();
	
	//Check whether two arrays are equal to each other.
	arraysSonIguales();
	}
	
	
	@Test
	public void sonIguales() {
		assertEquals(p1,p2);
	}
	
	
	@Test
	public void esVerdadero() {
		assertTrue(p1.getM2() < p2.getM2());
	}
	
	@Test 
	public void esFalso() {
		assertFalse(p1.getHabitaciones() > p2.getHabitaciones());
	}
	
	@Test
	public void noNulo() {
		assertNotNull(p1);
	}
	
	@Test
	public void esNulo() {
		assertNull(p1);
	}
	
	@Test
	public void referenciaMismoObjeto() {
		assertSame(p1,p2);
	}
	
	@Test
	public void referenciaDistintoObjeto() {
		assertNotSame(p1,p2);
	}
	
	@Test
	public void arraysSonIguales() {
		assertArrayEquals(p1.getPropietariosAnteriores(), p2.getPropietariosAnteriores());
	}
	

}