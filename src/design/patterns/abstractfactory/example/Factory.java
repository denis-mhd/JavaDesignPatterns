package design.patterns.abstractfactory.example;

public interface Factory {

    public <T> T produce(String type);
}
