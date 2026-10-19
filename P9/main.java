class Employee {
    String name;
    double salary;

    // Static variable to count employees
    static int count = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }

    public static void main(String[] args) {

        // Create objects using different constructors
        Employee e1 = new Employee();
        Employee e2 = new Employee("Harshal", 350000);
        Employee e3 = new Employee("Prashant", 300000);

        // Display employee details
        System.out.println("Employee 1:");
        e1.display();

        System.out.println("Employee 2:");
        e2.display();

        System.out.println("Employee 3:");
        e3.display();

        // Display total employee count
        Employee.displayCount();
    }
}
