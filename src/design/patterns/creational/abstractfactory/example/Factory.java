package design.patterns.creational.abstractfactory.example;

public interface Factory {

    public <T> T produce(String type);
}
