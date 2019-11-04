package com.dxc.client;

import junit.framework.TestCase;

public class AddNumbersTest extends TestCase {

	public void testSum() {
		AddNumbers numbers = new AddNumbers();
		int res = numbers.sum(1, 1);
		assertEquals(2, res);
	}

}
