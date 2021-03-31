package Collections.HashMap;

import java.util.HashMap;

public class KeyChecking
{
      public static void main(String[] args)
      {
          HashMap<Integer, String> map1 = new HashMap<>();
          map1.put(1, "Java");
          map1.put(2, "C");
          map1.put(3, "C++");
          map1.put(4, "Python");
          map1.put(501, "Android");
          System.out.println(map1.containsKey(5));
          System.out.println(map1.containsKey(7));
          System.out.println(map1.containsKey(1));

          System.out.println(map1.containsValue("Python"));
          System.out.println(map1.containsValue("Android"));
          System.out.println(map1.containsValue("Java"));
          System.out.println("Map is Empty:? "+map1.isEmpty());
          System.out.println("Keys in Map1 are: "+map1.keySet());
          System.out.println("Values in Map1 are: "+map1.values());
          System.out.println("Entries in the Map are: "+map1.entrySet());
      }
}