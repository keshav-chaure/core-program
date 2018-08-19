package com.ck.UnitTestDemo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProgramTest {

	Program p = new Program();

	@Test
	public void test() {
		int[] numbers = { 8, 4, 5 };
		int expectedLength = 3;
		int longestLength = p.getLongestSubStringLength(numbers);
		// xT assertEquals(expectedLength, longestLength);
		// fail("not complete implementation");
	}

	@Test
	public void testPrintSortedPerson() {
		p.printSortedPerson();
		// fail("no implementation");
	}

	@Test
	public void testAddPersons() {
		List<Person> expectedPersons = getExpectedPersons();
		List<Person> actualPersons = p.addPersons();
		assertEquals(expectedPersons, actualPersons);
	}

	@Test
	public void testReverseNo() {
		int num = 1234, c = 0;
		p.reverseNumber(num, c);
	}

	@Test
	public void testPrintList() {
		List<String> names = new ArrayList();
		names.add("ravi");
		names.add("rajesh");
		names.add("sanjiv");
		p.printList(names, 3);
	}

	@Test
	public void testMostOccaringChars() {
		String word = "nationals";
		p.mostOccaringChars(word);
	}
	
	@Test
	public void testMatrixMove(){
		int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
		p.matrixMove(matrix,3);
	}

	private List<Person> getExpectedPersons() {
		List<Person> expectedPersons = new ArrayList();
		expectedPersons.add(new Person("b1", "bijit"));
		expectedPersons.add(new Person("f1", "fijit"));
		expectedPersons.add(new Person("d1", "dijit"));
		expectedPersons.add(new Person("c1", "dijit"));
		return expectedPersons;
	}

}
