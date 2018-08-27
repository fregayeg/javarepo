package tn.ocp.classdesign.singleton;

public class Test {

	public static void main(String[] args) {
		
		// TODO: Test the classic singleton
		
		MyClassicSingleton classicSingleton1 = MyClassicSingleton.getInstance();
		MyClassicSingleton classicSingleton2 = MyClassicSingleton.getInstance();
		
		System.out.println(classicSingleton1.equals(classicSingleton2));
	}

}
