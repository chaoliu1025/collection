package org.lc.list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add("a");
		int oldCapacity = 3;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(newCapacity);
		
	}
}
