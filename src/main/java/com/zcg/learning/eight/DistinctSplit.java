package com.zcg.learning.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctSplit {

	public static void main(String[] args) {

        String[] strings = {"Hello", "World"};

        //Arrays.stream接收一个数组返回一个流
        List<Stream<String>> streamList = Arrays.asList(strings).stream().
                map(str -> str.split("")).
                map(str -> Arrays.stream(str)).
                collect(Collectors.toList());

        streamList.stream().forEach(sl -> sl.forEach(sll -> System.out.println(sll)));
        //分步写(map)

        Stream<String[]> stream = Arrays.asList(strings).stream().
                map(str -> str.split(""));

        Stream<Stream<String>> streamStream = stream.map(strings1 -> Arrays.stream(strings1));
        List<Stream<String>> streamList1 = streamStream.collect(Collectors.toList());

        //================================================

        List<String> stringList = Arrays.asList(strings).stream()
                .map(str -> str.split(""))
                .flatMap(str -> Arrays.stream(str))
                .distinct()
                .collect(Collectors.toList());

//        stringList.stream().forEach(s -> System.out.println(s));
        
        //分步写(流只能消费一次)(flatMap)
        Stream<String[]> stream1 = Arrays.asList(strings).stream().
                map(str -> str.split(""));

        Stream<String> stringStream = stream1.flatMap(strings1 -> Arrays.stream(strings1));

        List<String> stringList1 = stringStream.collect(Collectors.toList());
	}
}
