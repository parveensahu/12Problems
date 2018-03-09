
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a boy I am a";
		//System.out.println(str.length());
		String[] strArr = str.split(" ");
		Map<String,Integer> map = new HashMap<String, Integer>();
		//print(map.size());
		for(String count: strArr) {
			if(map.containsKey(count)) {
				map.put(count, map.get(count) + 1);
			}
			else {
				map.put(count, 1);
			}
			
		}print(map.size());
		
		for(Entry<String,Integer> set : map.entrySet()) {
			print(set.getKey() +  " "  + set.getValue());  
		}
	
	}
	
	public static void print(Object  o) {
		System.out.println(o);
	}
}
