package com.zcg.learning.eight;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList( "c", "b", "d" );
		String separator = ",";
		strList.forEach( e -> {
			System.out.print( e + separator ); 
		});
		
		
		strList.sort( (e1,e2) -> e1.compareTo(e2));
		System.out.println(strList);
		
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for (String string : stringArray) {
			System.out.println(string);
		}
		
	}
}
