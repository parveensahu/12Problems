package SortasFrequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortasFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 4, 5, 6, 2, 2, 1, 8, 1 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(Integer a: arr) {
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			}
			else {
				hm.put(a, 1);
			}
		}
		
		Set<Entry<Integer, Integer>> entries = hm.entrySet();
		for (Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}

		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(hm);
		Set<Entry<Integer, Integer>> mappings = tm.entrySet();

		System.out.println("HashMap after sorting by keys in ascending order ");

		for (Entry<Integer, Integer> mapping : mappings) {

			System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
		}

		Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				Integer v1 = e1.getValue();
				Integer v2 = e2.getValue();
				return v1.compareTo(v2);
			}
		};
		// Sort method needs a List, so let's first convert Set to List in Java
		List<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(entries);

		// sorting HashMap by values using comparator
		Collections.sort(listOfEntries, valueComparator);
		LinkedHashMap<Integer, Integer> sortedByValue = new LinkedHashMap<Integer, Integer>(listOfEntries.size());
		// copying entries from List to Map
		for (Entry<Integer, Integer> entry : listOfEntries) {
			sortedByValue.put(entry.getKey(), entry.getValue());
		}
		System.out.println("HashMap after sorting entries by values ");
		Set<Entry<Integer, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
		for (Entry<Integer, Integer> mapping : entrySetSortedByValue) {
			System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
		}
		
	}

}
