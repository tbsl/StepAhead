package RND;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class list {

	public static void main(String[] args) {
		Set<Integer> value=new HashSet<Integer>();
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
