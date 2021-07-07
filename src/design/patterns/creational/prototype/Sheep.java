package design.patterns.creational.prototype;


public class Sheep implements Prototype<Sheep>{
    private String name;
    private String color;

    public Sheep(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        Sheep clone = (Sheep) super.clone();
        clone.setName(clone.name);
        clone.setColor(clone.getColor());
        return clone;
    }
}
