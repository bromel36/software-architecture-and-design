package com.ex4.way1;

class Consultant extends Employee {
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
