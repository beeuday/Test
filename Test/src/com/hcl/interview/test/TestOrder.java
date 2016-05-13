package com.hcl.interview.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hcl.interview.OrderLogic;

public class TestOrder {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testProcessOrder() throws Exception {
		OrderLogic logic = new OrderLogic();
		ArrayList<String> ordersList = logic.processOrder(null);

		assertEquals(ordersList.get(0), "testServiceA");
		assertEquals(ordersList.get(1), "testServiceB");
		assertEquals(ordersList.get(2), "testServiceAA");
		assertEquals(ordersList.get(3), "testServiceC");

	}
}
