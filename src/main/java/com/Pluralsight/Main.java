package com.Pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My house", "2020-04-01", 250000, "123 oakland St",
                3, 2000, 5000));
        assets.add(new House("Vacation home", "2015-08-15", 180000,
                "456 Beach Drive", 2, 1500, 3000));

        assets.add(new Vehicle("Tom's truck", "2018-03-10", 30000,
                "Ford F-150", 2018, 120000));
        assets.add(new Vehicle("My car", "2021-07-20", 25000,
                "Honda Civic", 2021, 95000));

        for (Asset asset : assets) {
            String message;

            if (asset instanceof House) {
                House house = (House) asset;
                message = "House at " + house.getAddress();
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            } else {
                message = "Unknown asset type.";
            }

            
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());
            System.out.println(message);
            System.out.println("--------------------------");
        }





    }
}