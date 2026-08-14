public class Main {
    public static void main(String[] args) {
        attributesClass attributesClassObject = new attributesClass(); // create a new object

        int number = attributesClassObject.x; // access attribute of that class using the object
        System.out.println("X is equal to " + number);

        attributesClassObject.x = 5; // reassign the attribute
        System.out.println("Now X is equal to " + attributesClassObject.x);

        // ----------------------------------------------------------------------------------------

        methodsClass methodsClassObject = new methodsClass();

        // System.out.println(methodsClassObject.getX());

        // Try using the "getY()" method using the object "methodsClassObject"

        // ----------------------------------------------------------------------------------------

        // Try creating an object of parametersClass

        // Try using the "printInfo" method

        // Try using the "testStats" method

        // ----------------------------------------------------------------------------------------

        constructorsClass constructorsClassObject = new constructorsClass(true);

    }

}
