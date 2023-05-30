package student;

public class Execution {
	public static void main(String[] args) {
		
        MyClass myObject = new MyClass();
        
        myObject.setEnrollno("12345");
        myObject.setResult("Pass");
        
        System.out.println(myObject.toString());
        
        String enrollno = myObject.getEnrollno();
        String result = myObject.getResult();

        System.out.println("Enrollment number: " + enrollno);
        System.out.println("Result: " + result);
	}
}
