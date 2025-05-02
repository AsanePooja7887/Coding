package practice;

import java.util.*;

public class ArrListCount
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("harsh");
        list.add("jay");
        list.add("kiran");
        list.add("harsh");

        for(int i=0; i<list.size()-1; i++)
        {
            String name=list.get(i);
            int count=1;
            for(int j=i+1; j<list.size(); j++)
            {
                if(name.equals(list.get(j)))
                {
                    count++;
                }
            }
            if(count>=1)
            {
                System.out.println(name+" occures "+count+" times");
            }

        }
        System.out.println("Original list :- "+list);
        Collections.reverse(list);

        System.out.println("After reversing :- "+list);

        List<String> finallist = new ArrayList<>();
        Set<String> duplicate =new HashSet<>();

        for(String name:list)
        {
            if(duplicate.add(name))
            {
                finallist.add(name);

            }

        }
        System.out.println("duplicates removed: " + finallist);
    }
}
