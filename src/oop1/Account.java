package oop1;

public class Account {
    private String accountNumber = "";
    private String customerName = "";
    private String customerEmail = "";
    private String customerPhone = "";
    private double accountBallance = 0.0;


    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getAccountBallance() {
        return accountBallance;
    }

    public void setAccountBallance(Double accountBallance) {
        this.accountBallance = accountBallance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountBallance(12.0);
        account.setAccountNumber("123");
        System.out.println("Old balance: " + account.getAccountBallance());

        System.out.println("Balance: " + account.getAccountBallance());
        account.depositInAccount(3);
        System.out.println("Balance: " + account.getAccountBallance());
        account.withdrawFromAccount(10);
        System.out.println("Balance: " + account.getAccountBallance());

    }

    public void depositInAccount(double deposit) {
        if (deposit >= 0) {
            accountBallance += deposit;
        }
    }

    public void withdrawFromAccount(double amount) {
        if (accountBallance >= amount && amount >= 0) {
            accountBallance -= amount;
        }
    }
}
