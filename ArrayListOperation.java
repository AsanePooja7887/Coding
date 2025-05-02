
package practice;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Pooja");
        al.add("Rani");
        al.add("Sima");
        al.add("Yogita");
        System.out.println(al);

        //iteration
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        al.remove("Rani");
        System.out.println("removing element rani" + al);

    }
}