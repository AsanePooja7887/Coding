package practice;

public class String_Rev
{
    public static void main(String[] args) {
        String  str = "pooja";
        String rev = "";
//        for(int i =str.length()-1;i>=0;i--)
//        {
//            rev = rev+str.charAt(i);
//
//        }
//        System.out.println(rev);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
