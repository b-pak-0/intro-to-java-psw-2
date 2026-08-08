package examples;

public class Main {
    public static void main(String[] args) {
        attributesClass example = new attributesClass(); // create a new object of class exampleClass

        int x = example.x; // access attribute of that class using the object

        System.out.println("X is equal to " + x);

        example.x = 5; // reassign the attribute

        System.out.println("Now X is equal to " + example.x);

        parametersClass parametersE = new parametersClass();
        parametersE.printInfo("Brian", 16, 3.14159265358979323);
    }
}