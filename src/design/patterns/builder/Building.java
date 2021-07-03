package design.patterns.builder;

//The tricky part in this design pattern is that you have static Builder class in your original class that needs to be build.
//It have same fields, because it is doing the setting part and then they are passed to the constructor, by invoking build method (function)
//of original class
public class Building {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public static class BuilderClass{
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        public BuilderClass(){}

        // All methods(functions) from a to e doing the setting part
        public BuilderClass a(String a){
            this.a = a;
            return this;
        }

        public BuilderClass b(String b){
            this.b = b;
            return this;
        }

        public BuilderClass c(String c){
            this.c = c;
            return this;
        }

        public BuilderClass d(String d){
            this.d = d;
            return this;
        }

        public BuilderClass e(String e){
            this.e = e;
            return this;
        }

        //Here we are invoking Building constructor and we are passing the Builder with all set fields
        public Building build(){
            Building building = new Building(this);
            return building;
        }

    }

    //Here we are setting on our original object fields from Builder
    private Building(BuilderClass builder){
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getE() {
        return e;
    }


}
