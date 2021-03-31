package OOPS;

public class Vehicle
{
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size)
    {
        this.name = name;
        this.size = size;
        currentDirection = 0;
        currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction)
    {
        this.currentDirection =+ direction;
        System.out.println("OOPS.Vehicle steer: OOPS.Vehicle steering at: "+currentDirection+ " degrees");
    }

    public void move(int velocity, int direction)
    {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("OOPS.Vehicle moving at "+currentVelocity+" in the direction "+currentDirection+ "degrees");
    }
}