package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAddStrings {
	@Test
	public void test() {
		jUnitFunctions jufs = new jUnitFunctions();
		String result = jufs.addStrings("tus", "har");
		assertEquals("tushar", result);
	}

}
