package org.lc.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}
	
	public static void test1(){
		Map<String,Integer> seqMap = new LinkedHashMap<>();

		seqMap.put("c", 100);
		seqMap.put("d", 200);
		seqMap.put("a", 500);
		seqMap.put("d", 300);

		for(Entry<String,Integer> entry : seqMap.entrySet()){
		    System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	public static void test2(){
		Map<String,Integer> accessMap = new LinkedHashMap<>(16, 0.75f, true);

		accessMap.put("a", 100);
		accessMap.put("b", 200);
		accessMap.put("c", 500);
		accessMap.get("b");
		accessMap.put("d", 300);

		for(Entry<String,Integer> entry : accessMap.entrySet()){
		    System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	public static void test3(){
		LRUCache<String,Object> cache = new LRUCache<>(3);
		cache.put("a", "abstract");
		cache.put("b", "basic");
		cache.put("c", "call");
		cache.get("a");

		cache.put("d", "call");
		System.out.println(cache);
	}
	
	public static class LRUCache<K, V> extends LinkedHashMap<K, V> {
		private static final long serialVersionUID = 1L;
		private int maxEntries;
	    
	    public LRUCache(int maxEntries){
	        super(16, 0.75f, true);
	        this.maxEntries = maxEntries;
	    }
	    
	    @Override
	    protected boolean removeEldestEntry(Entry<K, V> eldest) {
	        return size() > maxEntries;
	    }
	}    
}
