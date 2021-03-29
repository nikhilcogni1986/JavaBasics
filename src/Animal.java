public class Animal
{
    private final String name;
    private final int brain;
    private final int body;
    private final int size;
    private final int weight;

    public void eat()
    {
        System.out.println("Animal Eat");
    }

    public void move(int speed)
    {
        System.out.println("Moving in Animal Class at speed" + speed);
    }

    public void walk()
    {

    }
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
}
