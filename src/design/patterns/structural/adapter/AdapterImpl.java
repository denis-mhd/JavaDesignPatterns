package design.patterns.structural.adapter;

public class AdapterImpl implements Adapter{
    private Adaptee adaptee;

    public AdapterImpl(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
