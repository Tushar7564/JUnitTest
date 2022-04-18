package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	@Test
	public void test() {
		jUnitFunctions juf = new jUnitFunctions();
		int result = juf.addNumbers(100, 300); 
		assertEquals(400, result);
	}

}
