package org.lc.map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		test7();
		
	}
	
	public static void test1(){
		Map<String, String> map  = new TreeMap<>();
		map.put("a", "abstract");
		map.put("c", "call");
		map.put("b", "basic");
		map.put("T", "tree");

		for(Entry<String,String> kv : map.entrySet()){
		    System.out.print(kv.getKey()+"="+kv.getValue()+" ");
		}
	}
	
	public static void test2(){
		Map<String, String> map  = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		map.put("a", "abstract");
		map.put("c", "call");
		map.put("b", "basic");
		map.put("T", "tree");

		for(Entry<String,String> kv : map.entrySet()){
		    System.out.print(kv.getKey()+"="+kv.getValue()+" ");
		}
	}
	
	public static void test3(){
		Map<String, String> map  = new TreeMap<>(new Comparator<String>(){

		    @Override
		    public int compare(String o1, String o2) {
		        return o2.compareTo(o1);
		    }
		});
		
		map.put("a", "abstract");
		map.put("c", "call");
		map.put("b", "basic");
		map.put("T", "tree");

		for(Entry<String,String> kv : map.entrySet()){
		    System.out.print(kv.getKey()+"="+kv.getValue()+" ");
		}
	}
	public static void test4(){
		Map<String, String> map  = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		map.put("T", "tree");
		map.put("t", "try");

		for(Entry<String,String> kv : map.entrySet()){
		    System.out.print(kv.getKey()+"="+kv.getValue()+" ");
		}
	}
	
	public static void test5(){
		Map<String, Integer> map  = new TreeMap<>();
		map.put("2016-7-3", 100);
		map.put("2016-7-10", 120);
		map.put("2016-8-1", 90);

		for(Entry<String,Integer> kv : map.entrySet()){
		    System.out.println(kv.getKey()+","+kv.getValue());
		}
	}
	public static void test6(){
		Map<String, Integer> map  = new TreeMap<>(new Comparator<String>() {
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    
		    @Override
		    public int compare(String o1, String o2) {
		        try {
		            return sdf.parse(o1).compareTo(sdf.parse(o2));
		        } catch (ParseException e) {
		            e.printStackTrace();
		            return 0;
		        }
		    }
		});
		
		map.put("2016-7-3", 100);
		map.put("2016-7-10", 120);
		map.put("2016-8-1", 90);

		for(Entry<String,Integer> kv : map.entrySet()){
		    System.out.println(kv.getKey()+","+kv.getValue());
		}
	}
	public static void test7(){
		NavigableMap<String, String> map  = new TreeMap<>();
		map.put("a", "abstract");
		map.put("f", "final");
		map.put("c", "call");

		//输出：a=abstract
		System.out.println(map.firstEntry());

		//输出：f=final
		System.out.println(map.lastEntry());

		//输出：c=call
		System.out.println(map.floorEntry("d"));

		//输出：f=final
		System.out.println(map.ceilingEntry("d"));

		//输出：{c=call, a=abstract}
		System.out.println(map.descendingMap().subMap("d", false, "a", true));
	}
}
