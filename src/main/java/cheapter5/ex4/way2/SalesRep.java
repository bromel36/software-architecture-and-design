package cheapter5.ex4.way2;

class SalesRep extends EmployeeImpl {
    private double sales;
    private double commissionRate;

    public SalesRep(String name, String id, double sales, double commissionRate) {
        super(name, id);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateMonthlyIncome() {
        return sales * commissionRate;
    }
}

