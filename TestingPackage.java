package student;
import NewPackage.PackageLearning;

// Directory: ../NewPackage/PackageLearning.java

// package NewPackage;

// public class PackageLearning {
// 	public static int a;
// 	public static int b;
// 	public int addMethod(){
// 		return a + b;
// 	}
// 	public void setMethod(int a, int b) {
// 		this.a = a;
// 		this.b = b;
// 	}
// }


public class TestingPackage {
	public static void main(String[] args) {
		PackageLearning tester = new PackageLearning();
		tester.setMethod(2, 3);
		System.out.println(tester.addMethod());
	}
}
