package Collection_FrameWork;

import java.util.Hashtable;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {

		// Map<String, Integer> students=new HashMap<>();
		Map<String, Integer> students = new Hashtable<>();

		students.put("Navin", 56);
		students.put("Harsh", 23);
		students.put("Sushil", 67);
		students.put("Kiran", 92);
		students.put("Harsh", 45);
        System.out.println(students.size());     //4
		System.out.println(students.keySet());   //[Navin, Kiran, Sushil, Harsh]
        System.out.println(students.values());   //[56, 92, 67, 45]
        System.out.println(students.entrySet()); //[Navin=56, Kiran=92, Sushil=67, Harsh=45]

        for (int i = 0; i < students.size(); i++) {
			     
        	System.out.println(students.values());
	}
		
		
		
		for (String key : students.keySet()) {
			System.out.println(key + ":" + students.get(key));
		}

	}
}