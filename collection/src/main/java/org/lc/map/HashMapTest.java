package org.lc.map;

import java.util.HashMap;
import java.util.Map;



public class HashMapTest {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<Student, String>();
		
		Student s1 = new Student();
		s1.setName("张三");
		Student s2 = new Student();
		s2.setName("李四");
		Student s3 = new Student();
		s3.setName("李四");
		
		map.put(s1, "zhang san");
		map.put(s2, "li si");
		
		System.out.println(map.get(s1));
		System.out.println(map.get(s2));
		System.out.println(map.get(s3));
		
		Map<Integer, String> inteMap = new HashMap<Integer, String>();
		inteMap.put(1, "1");
		inteMap.put(1, "11");
		System.out.println(inteMap.get(1));
	}

}
