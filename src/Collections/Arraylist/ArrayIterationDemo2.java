package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterationDemo2
{
      public static void main(String[] args)
      {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Mercedes");
            list1.add("Benz");
            list1.add("Maruthi");
            list1.add("Volkswagen");
            list1.add("Hero");
             System.out.println("Iterating using for loop................................");
            for(int i=0 ; i<list1.size(); i++)
                   System.out.println(list1.get(i));

            System.out.println("Iterating using enhanced for loop........................");
            for(String str: list1)
                  System.out.println(str +" ");

            System.out.println("Iterate using iterator...................................");
            Iterator itr = list1.iterator();
            //list1.iterator will return all objects of list1
            while (itr.hasNext())
            {
                  String obj = (String) itr.next();
                  System.out.println(obj);
            }
      }
}