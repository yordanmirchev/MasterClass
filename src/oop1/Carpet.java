package oop1;

public class Carpet {
    private double cost;

    public double getCost() {
        return cost;
    }

    public Carpet(double cost) {
        this.cost = cost > 0 ? cost : 0;
    }
}

