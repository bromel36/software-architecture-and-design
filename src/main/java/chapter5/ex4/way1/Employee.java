package chapter5.ex4.way1;

public abstract class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String storeData() {
        return "Name: " + name + ", ID: " + id;
    }

    public void displayData() {
        System.out.println(storeData());
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public abstract double calculateMonthlyIncome();
}



