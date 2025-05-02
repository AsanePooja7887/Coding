package practice;

public class RemoveFirstoccStr
{
    public void remove1stRepeatedChar(String str)
    {

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) { // Check if character repeats
                str = str.substring(0, i) + str.substring(i + 1); // Remove first occurrence
                //   ` break;
            }
        }
        System.out.println("  The first repeated character is removed from String : " + str);

    }
    public void removeLastRepeatedChar(String str)
    {
        for(int i =str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            if(str.indexOf(ch) != str.lastIndexOf(ch))
            {
                str = str.substring(0,i) + str.substring(i+1);
            }
        }

        System.out.println("The last repeated character is removed from String: " + str);
    }
    public static void main(String[] args) {
        String str = "programming"; // Example input

        RemoveFirstoccStr n =  new RemoveFirstoccStr();
        n.remove1stRepeatedChar(str);
        n.removeLastRepeatedChar(str);


    }
}
