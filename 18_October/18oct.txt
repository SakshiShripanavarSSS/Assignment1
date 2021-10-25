package com.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class JUnitTest {
	@Test
	public void testIfListContainsElement() {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(3);
		integerList.add(5);
		integerList.add(4);
		integerList.add(8);
		integerList.add(9);
		integerList.add(10);

		List<Integer> element = new ArrayList<Integer>();
		element.add(1);
		element.add(9);
		element.add(10);
		assertTrue("List contains 1,9 and 10", integerList.containsAll(element));
	}

	@Test
	public void testKeyValuePair() {
		Map<Integer, Integer> pair = new HashMap<Integer, Integer>();
		pair.put(1000, 10000);
		pair.put(1011, 10000);
		pair.put(-1001, 10000);
		pair.put(1001, 10000);

		assertTrue("Map contains -1001:10000 key:value pair", pair.containsKey(-1001));

	}

}