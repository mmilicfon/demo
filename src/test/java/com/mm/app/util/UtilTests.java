package com.mm.app.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilTests {

	@Test
	public void numberEqualsTest() {
		assertEquals(1, 2);
	}
}
