// Engine class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Car class
class Car {
    private String model;
    private Engine engine; // "has-a" relationship through composition

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class HasA {
    public static void main(String[] args) {
        Engine carEngine = new Engine("V8");
        Car myCar = new Car("Sedan", carEngine);
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Engine Type: " + myCar.getEngine().getType());
    }
}
