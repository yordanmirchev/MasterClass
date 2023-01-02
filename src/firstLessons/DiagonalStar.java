package firstLessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }


    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int r = 0; r < number; r++) {
                for (int c = 0; c < number; c++) {
                    if (r == 0 || r == number - 1 || c == 0 || c == number - 1 || c == r || c == number - r - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

        } else System.out.println("Invalid Value");
    }
}
