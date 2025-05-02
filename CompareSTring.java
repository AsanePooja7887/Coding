package practice;

public class CompareSTring
{
    public static void main(String[] args)
    {

        String s1 ="Hello";
        String s2 ="hello";
         if(s1.equals(s2))
         {
             System.out.println("Strings are equal");
         }
         else {
             System.out.println("Strings are not equal");
         }

         if(s1==s2)
         {
             System.out.println("Strings are equal");

         }
         else
         {
             System.out.println("Strings are  not equal");

         }
    }
}
