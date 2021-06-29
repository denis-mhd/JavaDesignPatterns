package design.patterns;

import design.paterns.singleton.example.PrinterExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

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

        }

    }

}
