package practice;

public class Palindrome_String
{
    public static void main(String[] args)
    {
        String str = "nayan";
        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev))
        {
            System.out.println(" Given String is palindrome string");
        }
        else
        {
            System.out.println(" Given String is nots palindrome string");
        }

    }
}
