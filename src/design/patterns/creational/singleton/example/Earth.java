package design.patterns.creational.singleton.example;

public class Earth {
    private static Earth myEarth= null;

    private Earth(){}

    public static synchronized Earth getMyEarth(){
        if (myEarth == null){
            myEarth = new Earth();
        }
        System.out.println("Hello I am the only Earth!");
        return(myEarth);
    }
}
