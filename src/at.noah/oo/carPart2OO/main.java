package carPart2OO;

import carPart2OO.car;

public class main {


    public static void main(String[] args) {
        int a = 7;

        car c1 = new car();
        c1.brand = "Audi";
        c1.fuelConsuption = 7;
        c1.serialNumber = "A1234";
        c1.totalFuelAmount = 70;
        c1.fuelAmount = 70;


        car c2 = new car();
        c2.brand = "Mercedes";
        c2.fuelConsuption = 6;
        c2.serialNumber = "M1234";
        c2.totalFuelAmount = 20;
        c2.fuelAmount = 20;


        System.out.println("car2 is a " + c2.brand + c2.serialNumber + " Benzinverbrauch von car2:  " + c2.fuelConsuption);

        System.out.println("currentfuel = " + c2.fuelAmount);
        c2.drive();
        c2.breack();
        c2.honk(5);
        c2.superboost();

        System.out.println("currentfuel = " + c2.fuelAmount);
        c2.drive();
        c2.drive();
        System.out.println("currentfuel = " + c2.fuelAmount);
        c2.superboost();


        //D R Y
    }

    public static void turboBoost(String[] Args) {
    }
}


