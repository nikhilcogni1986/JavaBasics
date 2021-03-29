public class MethodOverridingTest
{
    public void display()
    {
        System.out.println("In Parent class display method");
    }
    public void test()
    {
        System.out.println("New test method in parent class can be called by child class object");
    }
}

class Demo extends MethodOverridingTest
{
    @Override
    public void display()
    {
        System.out.println("In Child class display method");
    }

    public static void main(String[] args) {
    Demo D1 = new Demo();
    D1.display();

    MethodOverridingTest T1 = new MethodOverridingTest();
    T1.display();

    MethodOverridingTest T2 = new Demo();
    T2.display();
    T2.test();

  }
}
