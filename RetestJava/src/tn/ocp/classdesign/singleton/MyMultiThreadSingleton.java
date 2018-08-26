package tn.ocp.classdesign.singleton;

/**
 * Example of Singleton for multithreading apps using synchronized concurrency mechanism
 * idiom DP
 * 
 * @author Firas
 */
public class MyMultiThreadSingleton {
	
	// TODO: create the reference with null value
	private static volatile MyMultiThreadSingleton multiThreadSingleton;

	// private constructor to prevent clients from direct instantiations
	private MyMultiThreadSingleton() {
	}

	/**
	 * Revert only one instance
	 * in case of multi threading, when the first thread enter, the second one wait
	 * till the first one finishs it turn
	 * @return the instance if the reference above is equals to null
	 */
	public static synchronized MyMultiThreadSingleton getInstance() {
		
		if (multiThreadSingleton == null) {
			multiThreadSingleton = new MyMultiThreadSingleton();
		}
		return multiThreadSingleton;
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO: test equality between 2 instances of same singleton
		MyMultiThreadSingleton mySingleton1 = MyMultiThreadSingleton.getInstance(); // create the instance
		MyMultiThreadSingleton mySingleton2 = MyMultiThreadSingleton.getInstance(); // get the previous instance

		System.out.println(mySingleton1 == mySingleton2);// prints: true; same hashcodes!
	}
}
