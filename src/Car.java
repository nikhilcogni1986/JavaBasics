public class Car
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car(int doors, int wheels, String model, String engine, String color)
    {
        this.color = color;
        this.doors = doors;
        this.engine = engine;
        this.model = model;
        this.wheels = wheels;
    }

    public Car(String model, String engine)
    {
        this.color = "Red";
        this.wheels = 6;
        this.doors = 6;
        this.model = model;
        this.engine = engine;
    }



    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }
}
