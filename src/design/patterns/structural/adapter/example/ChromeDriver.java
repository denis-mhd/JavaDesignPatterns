package design.patterns.structural.adapter.example;

//Let's say that we have to add ChromeDriver, but it supports only these methods, that is good situation to use Adaptor design pattern
public class ChromeDriver {
    public void findElement() {
        System.out.println("Element from Chrome");
    }

    public void clickElement() {
        System.out.println("Selected element from Chrome");
    }
}
