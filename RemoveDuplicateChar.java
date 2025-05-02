package practice;

public class RemoveDuplicateChar
{
    public static void main(String[] args) {
        String str = "pooja";
         String  res ="";

         for (int i =0 ;i < str.length();i++)
         {
             char c = str.charAt(i);
             if(res.indexOf(c)==-1)
             {
                 res+=c;
             }
         }
        System.out.println(res);


    }
}
