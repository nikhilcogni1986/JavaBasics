package Collections.Arraylist;

import java.util.ArrayList;

public class ArrayListAppendDemo
{
    public static void main(String[] args)
   {
        ArrayList<String> original_list = new ArrayList<>();
        original_list.add("Steve");
        original_list.add("Justin");
        original_list.add("Rajesh");
        original_list.add("John");
        original_list.add("Arnold");
        original_list.add("Ramesh");

        ArrayList<String> appending_list = new ArrayList<>();
        appending_list.add("Keerthi");
        appending_list.add("Alan");
        appending_list.add("Dablu");

        System.out.println("Original List before addition: "+original_list);
        System.out.println("Array List before addition:"+appending_list);
        original_list.addAll(appending_list);
        System.out.println("List post addition: "+original_list);
   }
}