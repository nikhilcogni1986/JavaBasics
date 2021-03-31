package Collections.HashMap;

import java.util.HashMap;

public class HashMapDemo1
{
      public static void main(String[] args)
      {
          HashMap<Integer, String> map1 = new HashMap<>();
          map1.put(1, "Java");
          map1.put(2, "C");
          map1.put(3, "C++");
          map1.put(4, "Python");
          map1.put(5, "Android");
          System.out.println(map1);
          System.out.println("Size of the Map is: "+map1.size());
          System.out.println(map1.get(5));
          map1.remove(1);

          System.out.println("After removing an element:"+map1.size());
          System.out.println(map1);

          HashMap<Integer,String> map2 = new HashMap<>();
          map2.put(101, "John");
          map2.put(201, "Scott");
          map2.put(301, "Michael");
          map2.put(401, "Miller");
          map2.put(501, "Jindal");
          System.out.println("Second Map elements:");
          System.out.println(map2);
      }
}