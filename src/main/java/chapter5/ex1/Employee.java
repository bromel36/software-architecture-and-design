package chapter5.ex1;

class Employee implements SalaryCalculator {
    private String name;
    private String category;
    private double overtimeHours;
    private double baseSalary;
    private double overtimeRate;

    public Employee(String name, String category, double overtimeHours) {
        this.name = name;
        this.category = category.toUpperCase();
        this.overtimeHours = overtimeHours >= 0 ? overtimeHours : 0;

        // Assign base salary and overtime rate based on category
        switch (this.category) {
            case "A":
                this.baseSalary = 2000;
                this.overtimeRate = 15;
                break;
            case "B":
                this.baseSalary = 1500;
                this.overtimeRate = 10;
                break;
            case "C":
                this.baseSalary = 800;
                this.overtimeRate = 5;
                break;
            default:
                this.baseSalary = 0;
                this.overtimeRate = 0;
                System.out.println("Invalid category for " + name + ". Salary set to 0.");
        }
    }

    @Override
    public double getSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }

    public void display() {
        System.out.println("Employee: " + name);
        System.out.println("Category: " + category);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Overtime Rate: $" + overtimeRate + "/hour");
        System.out.println("Total Salary: $" + getSalary());
        System.out.println("------------------------");
    }
}
