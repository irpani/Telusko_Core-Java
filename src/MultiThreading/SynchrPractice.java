package MultiThreading;

class Abc {
	// Synchronized Keyword help us to Accesss Only One Thread At a Time

	// Same Object we cann't Access because Object got locked
	// If two objects It will access

	// In real time Two Persons are Accessing their Account at the same time
	public synchronized void m1(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}

}

public class SynchrPractice {

	public static void main(String[] args) {

		Abc a = new Abc();
		Abc b = new Abc();

		a.m1(10, 20);
		b.m1(20, 30);

	}

}
