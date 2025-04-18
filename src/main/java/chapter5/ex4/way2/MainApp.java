package chapter5.ex4.way2;


public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Testing Abstract Class Implementation ===");
        testAbstractClassImplementation();

        System.out.println("\n=== Testing Interface Implementation ===");
        testInterfaceImplementation();
    }

    private static void testAbstractClassImplementation() {
        // Create SalesRep instance
        SalesRep salesRep = new SalesRep("John Doe", "SR001", 100000, 0.1);
        System.out.println("SalesRep:");
        salesRep.displayData();
        System.out.println("Monthly Income: $" + salesRep.calculateMonthlyIncome());
        System.out.println("Name: " + salesRep.getName());
        System.out.println("ID: " + salesRep.getId());

        // Create Consultant instance
        Consultant consultant = new Consultant("Jane Smith", "CS001", 160, 50);
        System.out.println("\nConsultant:");
        consultant.displayData();
        System.out.println("Monthly Income: $" + consultant.calculateMonthlyIncome());
        System.out.println("Name: " + consultant.getName());
        System.out.println("ID: " + consultant.getId());
    }

    private static void testInterfaceImplementation() {
        // Create SalesRepImpl instance
        EmployeeInterface salesRep = new SalesRep("Bob Wilson", "SR002", 150000, 0.08);
        System.out.println("SalesRepImpl:");
        salesRep.displayData();
        System.out.println("Monthly Income: $" + salesRep.calculateMonthlyIncome());
        System.out.println("Name: " + salesRep.getName());
        System.out.println("ID: " + salesRep.getId());

        // Create ConsultantImpl instance
        EmployeeInterface consultant = new Consultant("Alice Brown", "CS002", 140, 60);
        System.out.println("\nConsultantImpl:");
        consultant.displayData();
        System.out.println("Monthly Income: $" + consultant.calculateMonthlyIncome());
        System.out.println("Name: " + consultant.getName());
        System.out.println("ID: " + consultant.getId());
    }
}
