package tn.ocp.classdesign.singleton;

/**
 * Example of classic lazy Singleton class with test
 * @author REGAYEG
 *
 */
public class MyClassicSingleton {
	
	// initialize the reference at null
	private static MyClassicSingleton classicSingleton = null;
	
	// private constructor to prevent clien from direct instantiation outside the class
	private MyClassicSingleton() {}
	
	/**
	 * Get the insance
	 * @return Already instantiated instance or instantiate a new one
	 */
	public static MyClassicSingleton getInstance () {
		
		// test if the reference is still on null
		if(classicSingleton == null) {
			// instantiate with new keyword
			return classicSingleton = new MyClassicSingleton();
		}
		// return back the already instantiated instance
		return classicSingleton;
	}
}

