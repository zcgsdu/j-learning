package com.zcg.learning.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class LambdaTest {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList( "c", "b", "d" );
		String separator = ",";
		strList.forEach( e -> {
			System.out.print( e + separator ); 
		});
		Collections.sort(strList,(e1,e2) -> e1.compareTo(e2));
		
		strList.sort( (e1,e2) -> e1.compareTo(e2));
		System.out.println(strList);
		
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		strList.forEach(str -> System.out.println(str));
		
		Arrays.asList(stringArray).stream().filter((s-> s.length() > 5 && s.contains("a"))).forEach(s->System.out.println(s));
		
	}
}
