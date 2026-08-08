package examples;

public class Main {
    public static void main(String[] args) {
        attributesClass attributesClassObject = new attributesClass(); // create a new object of class exampleClass
        int x = attributesClassObject.x; // access attribute of that class using the object
        System.out.println("X is equal to " + x);

        attributesClassObject.x = 5; // reassign the attribute
        System.out.println("Now X is equal to " + attributesClassObject.x);

        // ----------------------------------------------------------------------------------------

        parametersClass parametersClassObject = new parametersClass();

        parametersClassObject.printInfo("Brian", 16, 3.14159265358979323);

        // Try using the

    }
}