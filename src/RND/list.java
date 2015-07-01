package RND;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.examples.NewWorkbook;

public class list {

	public static void main(String[] args) {
		Set<Integer> value=new HashSet<>();
		value.add(1);
		value.add(199);
		value.add(9999);
		
		Iterator itr=value.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
		
		
/*		for(Integer a:value )
		{
			System.out.println("Value of A is "+a);
			
		}
		
*/
	}

}
