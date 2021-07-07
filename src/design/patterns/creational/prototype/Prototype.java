package design.patterns.creational.prototype;

//The Prototype pattern is basically the creation of new instances through
//cloning existing instances. By creating a prototype, new objects are created
//by copying this prototype.
//Be careful Prototype should extends the Cloneable java interface and every class which needs to be clone
//should implement the Prototype interface and override the clone() method
public interface Prototype<T> extends Cloneable{

    public T clone() throws CloneNotSupportedException;
}
