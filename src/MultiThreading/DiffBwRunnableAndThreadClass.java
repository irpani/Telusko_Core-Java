package MultiThreading;

public class DiffBwRunnableAndThreadClass {
	// DIFFEENCE between Runnable Vs Thraed Class ?

	/*****
	 * 
	 * Runnable :- ----------- Runnable is the Interface in java.lang package It has
	 * Only 1 Abstract method
	 * 
	 * interface runnable {
	 * 
	 * public void run();
	 * 
	 * }
	 * 
	 * 
	 */

	/*****
	 * Thread: Thread is a Concrete Class Available in java.lang package It is also
	 * implementing runnable interface It will override the run method giving dummy
	 * implementation runnable interface{
	 * 
	 * @override public void run();
	 * 
	 *           }
	 * 
	 *
	 */

	// Q: Which one is better to use runnable (or) Thread Class ?
	// A:
	/**
	 * We cann't say Which one is better It depends on the requiurement Supose both
	 * are same but the differene is when you are writing userdefined Thread Class
	 * By extending Thread Java Doesn't support Multiple Inherritance in ase Of
	 * classes So u cann't extend any other class
	 * 
	 * In case Of runnable interface With userdfined Thread implementing runnable
	 * interface then what will happned u have a chance to another class also How
	 * can implement Other interfaces
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
