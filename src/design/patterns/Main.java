package design.patterns;

import design.patterns.builder.example.BankAccount;
import design.patterns.singleton.example.PrinterExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String command = bufferedReader.readLine();

        switch (command){
            case "Singleton":

                //getMyPrinter() will print on console the hardcoded printer brand, model and the hashcode
                PrinterExample.getMyPrinter();
                PrinterExample.print("I am your Printer!");
                //calling getMyPrinter() will check if we calling same instance of MyPrinter
                PrinterExample.getMyPrinter();
            case "Builder":
                BankAccount bankAccount = new BankAccount.Builder()
                        .accountNumber(1234L)
                        .withOwner("Uncle Scrooge")
                        .atBranch("Somewhere")
                        .openingBalance(100000000)
                        .atRate(2)
                        .build();
        }

    }

}
