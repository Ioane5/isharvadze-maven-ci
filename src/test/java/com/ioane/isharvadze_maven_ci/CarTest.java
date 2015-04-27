package com.ioane.isharvadze_maven_ci;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

/**
 * Just some  testing
 * @author Ioane
 */
public class CarTest {

	// Super-dumb test. Just for Travis
	@Test
	public void test() {
		assertTrue(true);
	}
	
	
	@Test
	public void verify_setMark() {
		Car mockCar = mock(Car.class);
		mockCar.setmMark("Audi");
		
		verify(mockCar,times(1)).setmMark("Audi");;
	}

	
	@Test
	public void verify_getMark() {
		Car mockCar = mock(Car.class);

		when(mockCar.getmMark()).thenReturn("Audi");
		assertSame("Audi", mockCar.getmMark());
	}
}
