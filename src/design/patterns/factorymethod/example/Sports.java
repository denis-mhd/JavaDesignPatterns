package design.patterns.factorymethod.example;

public class Sports implements Car{
    @Override
    public void info() {
        System.out.println("Sports car created!");
    }
}
