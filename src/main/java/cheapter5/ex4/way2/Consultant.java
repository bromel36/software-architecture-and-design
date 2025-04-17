package cheapter5.ex4.way2;

class Consultant extends EmployeeImpl {
    private double hours;
    private double hourlyRate;

    public Consultant(String name, String id, double hours, double hourlyRate) {
        super(name, id);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlyIncome() {
        return hours * hourlyRate;
    }
}
