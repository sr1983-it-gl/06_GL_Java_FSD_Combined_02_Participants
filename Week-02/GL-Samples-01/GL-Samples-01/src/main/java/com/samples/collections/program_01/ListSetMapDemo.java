package com.samples.collections.program_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListSetMapDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Great");
		arrayList.add("Learning");
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Aman");
		hashMap.put(2, "Bobby");
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Red");
		hashSet.add("Green");
		
		for (String al : arrayList) {
			System.out.println(al);
		}
		
		for (String hs : hashSet) {
			System.out.println(hs);
		}
		
		for (Map.Entry<Integer, String> hm : hashMap.entrySet()) {
			System.out.println(hm.getKey() + " " + hm.getValue());
		}
	}
}