package Collections.Arraylist;

import java.util.ArrayList;

public class ArraySubList
{
      public static void main(String[] args)
      {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Steve");
            list1.add("Justin");
            list1.add("Rajesh");
            list1.add("John");
            list1.add("Arnold");
            list1.add("Ramesh");

            System.out.println("Original ArrayList Content: "+list1);

            //Sublist to ArrayList
            ArrayList<String> subList = new ArrayList<>(list1.subList(0,4));
            System.out.println("Sub List Content: "+subList);
      }
}