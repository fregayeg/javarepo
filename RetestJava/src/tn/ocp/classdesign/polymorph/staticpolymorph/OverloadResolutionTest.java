package tn.ocp.classdesign.polymorph.staticpolymorph;

public class OverloadResolutionTest {
	void show(int i, double b) {
		System.out.println("int first");
	}
	
	void show(double b, int i) {
		System.out.println("long first");
	}
	
	public static void main(String[] args) {
		OverloadResolutionTest overloadResolutionTest = new OverloadResolutionTest();
		//overloadResolutionTest.show(1, 1);
	}
}
