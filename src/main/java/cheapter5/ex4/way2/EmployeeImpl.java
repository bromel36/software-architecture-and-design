package cheapter5.ex4.way2;

class EmployeeImpl implements EmployeeInterface {
    private String name;
    private String id;

    public EmployeeImpl(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String storeData() {
        return "Name: " + name + ", ID: " + id;
    }

    @Override
    public void displayData() {
        System.out.println(storeData());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double calculateMonthlyIncome() {
        throw new UnsupportedOperationException("Subclasses must implement this method");
    }
}