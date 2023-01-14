package oop2.codding_exercise;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;

        System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;

        System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
    }

    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat, price, "breadRollType");
    }

    @Override
    public double itemizeHamburger() {
        double total = price + healthyExtra1Price + healthyExtra2Price;

        System.out.println("Healthy hamburger on a " + breadRollType + " with " + meat +
                "price is " + total);

        return total;
    }
}
