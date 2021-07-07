package design.patterns.creational.builder.example;

public class BankAccount {
    private final long accountNumber;
    private final String owner;
    private final String branch;
    private final double balance;
    private final double interestRate;

    public static class Builder{
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(){}

        //We add validation condition if needed
        public Builder accountNumber(long accountNum){
            this.accountNumber = accountNum;
            return this;
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        //Since the builder is in the BankAccount class, we can invoke its private constructor.
        public BankAccount build(){
            BankAccount account = new BankAccount(this);
            System.out.printf("Bank account with number %s and owner %s was created!", account.getAccountNumber(), account.getOwner());
            return account;
        }

    }

    private BankAccount(Builder builder){
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.branch = builder.branch;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }


}
