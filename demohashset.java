package siraj;
import java.util.*;
public class demohashset {

public static void main(String args[]){
	TreeSet<String> hashset=new TreeSet<>();
	hashset.add("Thyu");
	hashset.add("John");
	hashset.add("Aon");
	Iterator i= hashset.iterator();
	while(i.hasNext())
	{
		System.out.println("The Hashset values are:"+i.next());
	}
	
}
}


