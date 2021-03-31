package OOPS;

public class dog extends Animal
{
    private int legs;
    private int eyes;
    private  int tail;
    private int teeth;

    public dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat called()");
        chew();
        super.eat();
    }
    public void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk(int speed)
    {
        move(5);
        System.out.println("Moving at speed --> "+speed);
    }

    public void run(int speed)
    {
        move(10);
        System.out.println("Running at speed -->"+speed);
    }
}