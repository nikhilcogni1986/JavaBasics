package Collections.Arraylist;

import java.util.ArrayList;

public class ArrayListDemo1
{
      public static void main(String[] args)
      {
            ArrayList <String> list1 = new ArrayList<>();
            list1.add("JAVA");
            list1.add("C++");
            list1.add("Python");
            System.out.println(list1);

            //create another array list and insert using index
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1,100);
            list2.add(2,22);
            System.out.println(list2);

            //change an element in list1
            list1.set(0,"Kotlin");
            System.out.println(list1);

            //removing an element from the list
            ArrayList<String> list3 = new ArrayList<>();
            list3.add("Apple");
            list3.add("Orange");
            list3.add("Berries");
            list3.add("Pineapple");
            list3.add("Mango");
            System.out.println(list3);

            //remove Berries
            System.out.println(list3.remove("Berries"));
            System.out.println(list3);
            list3.remove(0);
            System.out.println(list3);
      }
}
