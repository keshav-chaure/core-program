package com.ck.UnitTestDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public int getLongestSubStringLength(int[] numbers) {
		// {8,4,5,6};
		// {0,1,2,3}
		int size = numbers.length;
		// System.out.println("size="+size);
		int cnt = 1;
		int[] copy = new int[size];
		copy[0] = numbers[0];

		int len = 0;
		for (int i = 0; i < size; ++i) {

		}

		// System.out.println("cnt : "+cnt);
		return cnt;
	}

	public void printSortedPerson() {
		// TODO Auto-generated method stub

	}

	public List<Person> addPersons() {
		List<Person> persons = new ArrayList();
		persons.add(new Person("b1", "bijit"));
		persons.add(new Person("f1", "fijit"));
		persons.add(new Person("d1", "dijit"));
		persons.add(new Person("c1", "dijit"));
		return persons;

	}

	public void reverseNumber(int num, int c) {
		// System.out.print(c++);
		System.out.print(num % 10);
		int temp = num / 10;
		// System.out.println(temp);
		if (temp > 0) {
			reverseNumber(temp, c);
		}
	}

	public void printList(List<String> names, int count) {
		String name = names.get(names.size() - count);
		count--;
		System.out.println(name);
		if (count > 0) {
			printList(names, count);
		}

	}

	public void mostOccaringChars(String word) {
		Map<Character, Integer> charCount = new HashMap();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (charCount.containsKey(c)) {
				Integer count = charCount.get(c);
				charCount.put(c, count + 1);
			} else {
				charCount.put(c, 1);
			}
		}

		System.out.println("charCount : " + charCount);
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("key " + entry.getKey() + " value "
						+ entry.getValue());
			}
			// System.out.println();
		}
	}

	public void matrixMove(int[][] matrix,int N) {
		displayMatrix(matrix);
		int temp;
		
		//1 2 3
		//4 5 6
		//7 8 9
		for(int i=0;i< N/2; i++ ){
			for(int j=i; j< N-i-1; j++){
				//System.out.println("["+i+"]["+j+"] => "+matrix[i][j]);
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][N-1-i];
				
		        // move values from bottom to right
                matrix[j][N-1-i] = matrix[N-1-i][N-1-j];
      
                // move values from left to bottom
                matrix[N-1-i][N-1-j] = matrix[N-1-j][i];
      
                // assign temp to left
				matrix[N-1-j][i] = temp;

				//1 4 7
				//4 5 6
				//7 8 9
			}
		}
		
		displayMatrix(matrix);
	}

	private void displayMatrix(int[][] matrix) {
		System.out.println("displyaing matrix ::");
		for(int i=0;i< matrix.length; i++ ){
			for(int j=0; j< matrix[i].length; j++){
				
				System.out.println("["+i+"]["+j+"] => "+matrix[i][j]);
			}
		}
	}

}
