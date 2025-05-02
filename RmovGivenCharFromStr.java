package practice;

public class RmovGivenCharFromStr
{
    public static void main(String[] args)
    {
        String str ="pooja";
        char ch = 'a';
         if(str == null)
        {
            System.out.println("String is null ");
        }
         else
         {
             System.out.println(str.replace(Character.toString(ch),""));

         }

    }
}
