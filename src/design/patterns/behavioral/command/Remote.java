package design.patterns.behavioral.command;


public class Remote implements Invoker{
    private Command on;
    private Command off;

    public Remote(Command on, Command off) {
        this.on = on;
        this.off = off;
    }

    @Override
    public void invoke(String command) {
        switch (command){
            case "On":
                this.on.execute();
                break;
            case "Off":
                this.off.execute();
                break;
        }
    }
}
