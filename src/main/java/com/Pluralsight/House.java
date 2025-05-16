package com.Pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    public House(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    public String getAddress() {return address;}

    public int getCondition() {return condition;}

    public int getSquareFoot() {return squareFoot;}

    public int getLotSize() {return lotSize;}

    public void setAddress(String address) {this.address = address;}

    public void setCondition(int condition) {this.condition = condition;}

    public void setSquareFoot(int squareFoot) {this.squareFoot = squareFoot;}

    public void setLotSize(int lotSize) {this.lotSize = lotSize;}

    public double getValue () {
        double pricePerSqFt = switch (condition) {
            case 1 -> 180;
            case 2 -> 130;
            case 3 -> 90;
            default -> 80;
        };
        return (squareFoot * pricePerSqFt) + (lotSize * 0.25);
    }
    public void house2 (){

    }
}
