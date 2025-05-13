package com.Pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {return makeModel;}

    public int getYear() {return year;}

    public int getOdometer() {return odometer;}

    public void setMakeModel(String makeModel) {this.makeModel = makeModel;}

    public void setYear(int year) {this.year = year;}

    public void setOdometer(int odometer) {this.odometer = odometer;}

    public double getValue(){

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        double value;
        if (age <= 3) {
            value = getOriginalCost() - (getOriginalCost() * 0.03 * age);
        } else if (age <= 6){
            value = getOriginalCost() - (getOriginalCost() * 0.06 * age);
        } else if (age <= 10){
            value = getOriginalCost() - (getOriginalCost() * 0.10 * age);
        }else {
            value = 1000.00;
        }
        if (odometer > 100000){
            String modelLower = makeModel.toLowerCase();
            if (!modelLower.contains("honda") && !modelLower.contains("toyota")){
                value = value - (value * 0.25);
            }
        }return value;
    }
}
