package design.patterns.creational.singleton.example;

//Another concrete example of Singleton usage is when you have connected printer
//you will always want to call your connected hardware(printer) to do some job
//Also you can find Singleton implementation in java.lang.Runtime*, java.util.logging.LogManager*
//java.sql.*(database connection), hardware access like simple example below
public class PrinterExample {
    private static PrinterExample myPrinter = null;
    private String brand;
    private String model;

    private PrinterExample (){
    }


    public static synchronized PrinterExample getMyPrinter(){
        if (myPrinter == null){
            myPrinter = new PrinterExample();
            myPrinter.brand = "Canon";
            myPrinter.model = "FX540";
        }
        System.out.println(myPrinter.brand + " " + myPrinter.model + " - My hash code is -"
                + myPrinter.getClass().hashCode());
        return myPrinter;
    }

    public static void print(String text){
        System.out.println(text);
    }
}
