package design.patterns.structural.adapter.example;

//This adapter make contract between interface WebDriver and Chrome driver(if we have to be explicit we should also have Chrome interface)
public class ChromeAdapter implements WebDriver {
    private ChromeDriver chromeDriver;

    public ChromeAdapter(ChromeDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    @Override
    public void getElement() {
        chromeDriver.findElement();
    }

    @Override
    public void selectElement() {
        this.chromeDriver.clickElement();
    }
}
