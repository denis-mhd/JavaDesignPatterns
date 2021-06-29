package design.patterns.singleton;

// Classical Java implementation of singleton
// design pattern
public class Singleton {
    private static Singleton singleton = null;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton(){
    }

    //static method to be able calling without initializing
    //after first initialization
    //synchronized is used to prevent two or more threads getting instance at the same time
    //it will allow only one thread to create single instance
    public static synchronized Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
