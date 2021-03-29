public class ConstructorChaining
{
    String name;
    int age;
    ConstructorChaining()
    {
        this("JAVA Constructor1");
    }
    ConstructorChaining(String var1)
    {
        this(var1, 6);
    }
    ConstructorChaining(String s, int age)
    {
        this.name = s;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

  public static void main(String[] args)
  {
        ConstructorChaining C1 = new ConstructorChaining();
  }
}
