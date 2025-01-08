package Collection_FrameWork;

import java.util.HashMap;
import java.util.List;

public class HashMapPract {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<>();
		System.out.println("Initial Memory is "+hm.size()); //0
		hm.put("IRFAN", 100);
		System.out.println("Current Memory is "+hm.size()); //1
		System.out.println(hm.entrySet());   //[IRFAN=100]
		 
       
	
	    HashMap<List<String>, HashMap<String, String>> hm1=new HashMap<>();
	     System.out.println(hm.size());
	     
	
	}

}
