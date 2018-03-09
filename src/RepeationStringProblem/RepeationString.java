package RepeationStringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input string array
		String[] strarr = new String[] { "Happy", "Coding", "Interesting", "Coding", "Happy" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : strarr) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		System.out.println(map);

		Map<String, Integer> map_result = new HashMap<String, Integer>();

		for (Map.Entry<String, Integer> en : map.entrySet()) {
			// System.out.println(en.getKey() + " " + en.getValue());
			if (en.getValue() > 1) {
				// System.out.println("Repeated Element is:"+ en.getKey());
				map_result.put(en.getKey(), en.getValue());
			}

		}
		System.out.println();
		System.out.println("Repeating elements are:");
		System.out.println(map_result);
	}

}
