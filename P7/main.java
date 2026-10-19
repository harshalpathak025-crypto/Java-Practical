class MyClass {

    // Constructor
    MyClass() {
        System.out.println("Object is constructed.");
    }

    // Method to use the object
    void display() {
        System.out.println("Object is being used.");
    }

    public static void main(String[] args) {

        // Create an object
        MyClass obj = new MyClass();

        // Use the object
        obj.display();

        // Remove the reference
        obj = null;

        System.out.println("Object reference removed.");

        // Request garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}
