package com.zcg.learning.java8inaction.chap6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;


public class Test {
	public static void main(String[] args) {
		//List<Map<String, Object>> 转 Map
		List<Map<String, Object>> listmap = new ArrayList<>();
		Map<String, Object> map1 = new HashMap<>();
		map1.put("temp1", "key1");
		map1.put("num1", "value1");
		Map<String, Object> map2 = new HashMap<>();
		map2.put("temp2", "key2");
		map2.put("num2", "value2");
		Map<String, Object> map3 = new HashMap<>();
		map3.put("temp3", "key3");
		map3.put("num3", "value3");
		Map<String, Object> map4 = new HashMap<>();
		map4.put("temp4", "key4");
		map4.put("num4", "value4");
		listmap.add(map1);
		listmap.add(map2);
		listmap.add(map3);
		listmap.add(map4);
		
		Map<Object,Object> map = listmap.stream().collect(toMap(m->m.get("temp"), m->m.get("num")));
		map.forEach((k1,v1)->System.out.println(k1+":"+v1));
		
	}
	
}
