import java.util.*;
import java.util.ArrayList;

public class TestCollection{

	public static void main (String[] args){
		for (String s: args){
			System.out.println(s);
		}
		
		List listA = new ArrayList();
		List listB = new LinkedList();
		List listC = new Vector();
		List listD = new Stack();
		
		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 3");
		listA.add("element 4");
		
		listA.add(0,"element 0");
		
		// Access by index
		Object element0 = listA.get(0);
		String element1 = (String)listA.get(1);
		String element3 = listA.get(3).toString();
		
		System.out.println(element3 + "--" + element1 + "--" + element0);
		
		// Acces by iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
			String element = (String) iterator.next();
			System.out.println(element);
		}
		
		
		for(Object o: listA){
		    if(((String)o).equalsIgnoreCase("ELEMENT 1")){
		        
		    }
		}
		
		// remove object
		listA.remove("element 2");
		
		// Riorder
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		//Access by new for-loop
		for(Object object:listA){
			String element = (String) object;
			System.out.println(element);
		}
		
	}
}