package design.patterns.structural.adapter.example;


public class MozillaDriver implements WebDriver{


    public void getElement() {
        System.out.println("Element from Mozilla");
    }

    public void selectElement() {
        System.out.println("Select element from Mozilla");
    }
}
