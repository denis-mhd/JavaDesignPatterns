package design.patterns.builder;

public class Building {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

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

    public static class BuilderClass{
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        public BuilderClass(){}

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

        public Building build(){
            Building building = new Building(this);
            return building;
        }

    }
}
