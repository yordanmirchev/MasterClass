package oop2.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount <= 100) {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        }

        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = duplex ? (pages / 2 + pages % 2) : pages;
        if (duplex){
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
