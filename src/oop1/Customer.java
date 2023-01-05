package oop1;

public class Customer {

    private String name;
    private String email;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer(){
        this("defaultName", "defaultEmail", 0.0);
    }


    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.creditLimit = -1;
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }
}
