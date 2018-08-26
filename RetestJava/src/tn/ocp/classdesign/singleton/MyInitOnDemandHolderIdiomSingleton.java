package tn.ocp.classdesign.singleton;

/**
 * Example of Singleton for multithreading apps using initialization on demande idiom DP 
 * @author Firas
 */
public class  MyInitOnDemandHolderIdiomSingleton {
	
	// private constructor to prevent clients from direct instantiations
	private MyInitOnDemandHolderIdiomSingleton () {	
	}
	
	//TODO: Use static nested class following the DP
	// using static nested class instead of synchronize in getInstance method
	// this makes more performance in multithread apps, cause static nested classes are NOT
	// loaded until they are referenced
	private static class StaticNestedClassInstance {
		private static final MyInitOnDemandHolderIdiomSingleton mySingleton = new MyInitOnDemandHolderIdiomSingleton();
	}
	
	/**
	 * Revert only one instance
	 * @return the instance inside the static nested class
	 */
	public static MyInitOnDemandHolderIdiomSingleton getInstance() {
		return StaticNestedClassInstance.mySingleton;
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO:  test equality between 2 instances of same singleton
		MyInitOnDemandHolderIdiomSingleton mySingleton1 = 
				MyInitOnDemandHolderIdiomSingleton.getInstance(); // create the instance
		MyInitOnDemandHolderIdiomSingleton mySingleton2 = 
				MyInitOnDemandHolderIdiomSingleton.getInstance(); // get the previous instance
		
		System.out.println(mySingleton1 == mySingleton2);// prints: true; same hashcodes!
	}
}

