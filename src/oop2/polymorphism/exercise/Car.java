package oop2.polymorphism.exercise;

import java.util.ArrayList;

public class Car {
    private String description;

    public Car() {
        this.description = "DefaultCar";
    }


    protected void startEngine() {
        System.out.println("Starting engine for " + this.getClass().getSimpleName());
    }

    public void drive() {
        System.out.println("Driving " + this.getClass().getSimpleName());
    }

}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int baterrySize;

    public ElectricCar() {
        this.avgKmPerCharge = 100;
        this.baterrySize = 2100;
    }

    @Override
    public void startEngine() {

        System.out.println("Start engine called from " + this.getClass().getSimpleName());
    }

    @Override
    public void drive() {

        System.out.println("Drive called from " + this.getClass().getSimpleName());
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar() {
        this.avgKmPerLitre = 10;
        this.cylinders = 8;
    }

    public void startEngine() {
        System.out.println("Start engine called from " + this.getClass().getSimpleName());
    }

    @Override
    public void drive() {

        System.out.println("Drive called from " + this.getClass().getSimpleName());
    }
}

class HybridCar extends Car {
    private double avgKmPerCharge;

    private int baterrySize;
    private double avgKmPerLitre;
    private int cylinders;

    public HybridCar() {
        this.avgKmPerCharge = 100.0;
        this.baterrySize = 2100;
        this.avgKmPerLitre = 10;
        this.cylinders = 8;
    }

    public void startEngine() {

        System.out.println("Start engine called from " + this.getClass().getSimpleName());
    }

    @Override
    public void drive() {

        System.out.println("Drive called from " + this.getClass().getSimpleName());
    }


    public static void main(String[] args) {

        Object basicCar = new Car();
        Object electricCar = new ElectricCar();
        Object gasCar = new GasPoweredCar();
        Object hybridCar = new HybridCar();
        String str = "foo";
        int integer = 1;

        ArrayList objects = new ArrayList();
        objects.add(basicCar);
        objects.add(electricCar);
        objects.add(gasCar);
        objects.add(hybridCar);
        objects.add(str);
        objects.add(integer);


        for (Object obj : objects) {
            System.out.println("\n~~~~~~~~~~\n");
            if (obj instanceof ElectricCar) {
                System.out.println("Electic Car");
                ((ElectricCar) obj).startEngine();
                ((ElectricCar) obj).drive();
            }

            if (obj instanceof GasPoweredCar) {
                System.out.println("Gas Car");
                ((GasPoweredCar) obj).startEngine();
                ((GasPoweredCar) obj).drive();
            }

            if (obj instanceof HybridCar) {
                System.out.println("Hybrid Car");
                ((HybridCar) obj).startEngine();
                ((HybridCar) obj).drive();

            }

            if (obj instanceof Car) {
                System.out.println("This is a basic car.");
            }

            if (!(obj instanceof Car)) {
                System.out.println("This is " + obj.getClass().getSimpleName());
                System.out.println(obj.toString());
            }

        }
    }
}