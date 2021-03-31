package OOPS;

public class AsciiValue
{
  public static void main(String[] args)
  {
    Character ch = 'a';
    int ascii = ch;
    System.out.println("ASCII value of "+ch+" is "+ascii);

    int[] array1 = {'a','b','c','d','e','f'};
    for (int i = 0; i < array1.length; i++)
        System.out.println((int)array1[i]);
  }
}