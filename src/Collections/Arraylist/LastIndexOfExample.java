package Collections.Arraylist;

import java.util.ArrayList;

public class LastIndexOfExample
{
      public static void main(String[] args)
      {
          ArrayList<Integer> list1 = new ArrayList<>();
          list1.add(1);
          list1.add(10);
          list1.add(100);
          list1.add(90);
          list1.add(11);
          list1.add(22);
          list1.add(134);
          list1.add(87);
          list1.add(10);

          System.out.println("Last occurrence of element 10: "+list1.lastIndexOf(10));
          System.out.println("Last occurrence of element 100: "+list1.lastIndexOf(100));
          System.out.println("Last occurrence of element 90: "+list1.lastIndexOf(90));
          System.out.println("Last occurrence of element 11: "+list1.lastIndexOf(11));
          System.out.println("Last occurrence of element 22: "+list1.lastIndexOf(22));
          System.out.println("Last occurrence of element 134: "+list1.lastIndexOf(134));
          System.out.println("Last occurrence of element 87: "+list1.lastIndexOf(87));
      }
}