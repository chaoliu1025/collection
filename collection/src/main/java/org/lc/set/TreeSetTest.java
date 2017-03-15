package org.lc.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}
	
	public static void test1(){
		Set<String> words = new TreeSet<String>();
		words.addAll(Arrays.asList(new String[]{
		    "tree", "map", "hash", "map",     
		}));
		for(String w : words){
		    System.out.print(w+" ");
		}
	}
	
	public static void test2() {
		Set<String> words = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		words.addAll(Arrays.asList(new String[] { "tree", "map", "hash", "Map", }));
		System.out.println(words);
	}
	public static void test3(){
		SortedSet<String> set = new TreeSet<String>();
		set.addAll(Arrays.asList(new String[]{
		    "c", "a", "b", "d","f"    
		}));

		System.out.println(set.first()); //a
		System.out.println(set.last()); //f
		System.out.println(set.headSet("b"));//[a]
		System.out.println(set.tailSet("d"));//[d, f]
		System.out.println(set.subSet("b", "e")); //[b, c, d]
		set.subSet("b", "e").clear(); //会从原set中删除
		System.out.println(set); //[a, f]
	}
}
