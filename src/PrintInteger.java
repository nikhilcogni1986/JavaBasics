import java.util.Scanner;

public class PrintInteger
{
  public static void main(String[] args)
  {
    // takes the input from user and prints it
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter an integer");
      int number = reader.nextInt();
      System.out.println("Entered Number is: "+number);
  }
}
