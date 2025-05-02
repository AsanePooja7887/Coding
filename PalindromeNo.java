package practice;

public class PalindromeNo
{
    public static void main(String[] args) {
        int num = 120;
        int rev =0 , sum = 0 ;
        int rem ;
          int i ;
                  i= num ;
          while(num != 0)
          {
              rem = num % 10 ;
              rev = rev * 10 + rem ;
              num = num / 10;
          }
          if(i == rev)

          {
              System.out.println(" number is palindrome");
          }
          else
          {
              System.out.println(" number is not palindrome");

          }

    }
}
