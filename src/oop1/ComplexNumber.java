package oop1;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real1, double imaginary1) {
        real += real1;
        imaginary += imaginary1;
    }

    public void add(ComplexNumber complexNumber) {
        real += complexNumber.getReal();
        imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real1, double imaginary1) {
        real -= real1;
        imaginary -= imaginary1;
    }

    public void subtract(ComplexNumber complexNumber) {
        real -= complexNumber.getReal();
        imaginary -= complexNumber.getImaginary();
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

}
