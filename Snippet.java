import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Snippet{
	public static void main (String[] args){
		Map<String,ArrayList<Object>> map = new HashMap<>();
		ArrayList<Object> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("d");
		list2.add("e");
		list2.add("f");
		
		map.put("one",list1);
		map.put("two",list2);
		Map<String,Object> map2 = new HashMap<>();
		map2.put("param",map);
		
		for (String key : map2.keySet()) {
		    System.out.println("Key = " + key);
		}

		//iterating over values only
		for (Object value : map2.values()) {
		    System.out.println("Value = " + value);
		}
		
		for(Entry<String, ArrayList<Object>> en : map.entrySet()){
			//System.out.println(en+ "--");
			for(Object obj : en.getValue()){
				//System.out.println(obj);
			}
		}
		
	}
}