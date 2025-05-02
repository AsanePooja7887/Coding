package practice;

import java.util.ArrayList;

public class contList
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pooja");
        list.add("Sima");
        list.add("Rani");
        list.add("Pooja");

        list.add("Harshu");
        for(int i=0; i<list.size()-1; i++)
        {
            String name=list.get(i);
            int count=1;
            for(int j=i+1; j<list.size(); j++)
            {
                if(name.equals(list.get(j)))
                {
                    count++;
                    break;

                }
            }
            if(count>=1)
            {
                System.out.println(name+" :  "+count);
            }

        }
    }
}
