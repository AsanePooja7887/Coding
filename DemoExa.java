package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DemoExa
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
         al.add("Swapnil");
         al.add("Lokesh");
         al.add("Sonu");
         al.add("Git");
         al.add("Rahul");
         al.add("Swapnil");
        al.add("Git");
        al.add("Div");
        al.add("Sonu");
        al.add("Swapnil");

        System.out.println(al);

        Map<String, Integer> countMap = new HashMap<>();

        for (String name : al)
        {
            if (countMap.containsKey(name))
            {
                countMap.put(name, countMap.get(name) + 1);
            }
            else
            {
                countMap.put(name, 1);
            }
        }


        System.out.println("Name Count: " + countMap);
    }
}
