package com.wly.simple_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		
		List<String> keyList = new ArrayList<>(map.keySet());
		List<String> valueList = new ArrayList<>(map.values());
		List entryList = new ArrayList<>(map.entrySet());
	}
	
	public void forMapTest(Map<String,String> map){
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
		}
	}
	
	public void IteratorMapTest(Map<String,String> map){
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Entry<String, String> entry = itr.next();
			String key = entry.getKey();
			String value = entry.getValue();
		}
	}
}
