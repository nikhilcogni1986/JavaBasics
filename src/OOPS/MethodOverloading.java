package OOPS;

public class MethodOverloading
{
    public int sum(int x)
    {
        return x;
    }

    public int sum(int  a, int b)
    {
        return a+b;
    }

    public float sum(float x, float y)
    {
        return x+y;
    }

    public Character sum(char c)
    {
        return c;
    }

    public void sum(byte b, int x)
    {
        System.out.println("Method A");
    }

  public static void main(String[] args) {
    MethodOverloading M1 = new MethodOverloading();
    System.out.println(M1.sum(10));
    System.out.println(M1.sum(10f, 10f));
    System.out.println(M1.sum(23,23));
    System.out.println(M1.sum(3000));
    System.out.println(M1.sum(2000, 23));
  }
}