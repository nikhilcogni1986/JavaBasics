package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap
{
      public static void main(String[] args)
      {
          HashMap<Integer,String> map2 = new HashMap<>();
          map2.put(101, "John");
          map2.put(201, "Scott");
          map2.put(301, "Michael");
          map2.put(401, "Miller");
          map2.put(501, "Johnson");

          //print all the keys
          for(int key :map2.keySet())
          {
                System.out.println("Key: "+key);
                System.out.println(key+" is present in the map? "+ map2.containsKey(key));
                System.out.println(map2.get(key));
          }

          //print all the values
          System.out.println("Values in the map are: ");
          for(String keyValue: map2.values())
          {
              System.out.println(keyValue);
          }

          //use of the entryset
          System.out.println("Iterate using entry set");
          for(Map.Entry entry :map2.entrySet()) {
              System.out.println(entry.getKey() + "  " + entry.getValue());
          }
          
          //use of set iterator
          System.out.println("Iterate using set itrator");
          Set<Map.Entry<Integer, String>> entries = map2.entrySet();
          Iterator itr  = entries.iterator();
          while (itr.hasNext())
          {
              Map.Entry entry = (Map.Entry) itr.next();
              System.out.println(entry.getKey() + "  " + entry.getValue());
          }
      }
}