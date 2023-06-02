package student;

class ExampleClass {
    public static int staticVariable = 20;
    public int simpleVariable = 20;

    public static void staticMethod() {
        System.out.println("This is a method that belongs to the class itself!");
    }
}

class ExampleClass2 extends ExampleClass{
	public static void staticMethod() {
        System.out.println("This is a static method that I am trying to override!");
    }
}

public class FinalStatic {
    public static void main(String[] args) {
        System.out.println("Welcome to my amazing program!");
        System.out.println("--------------------------------");

//        System.out.println("The constant value is: " + ExampleClass.simpleVariable);

        System.out.println("The static variable is: " + ExampleClass.staticVariable);
        System.out.println("Modifying the static variable...");
        ExampleClass.staticVariable = 30;
        System.out.println("The modified static variable is: " + ExampleClass.staticVariable);
        
        System.out.println("");

        System.out.println("Calling the static method...");
        ExampleClass.staticMethod();
        System.out.println("Overriding the static method...");
        ExampleClass2.staticMethod();
        

        System.out.println("--------------------------------");
        System.out.println("Thank you!");
    }
}

