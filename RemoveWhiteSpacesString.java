package practice;

public class RemoveWhiteSpacesString
{
    public void removeWhiteSpaces(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {

            if(str.charAt(i) != ' ')
            {
                System.out.print(str.charAt(i));
            }

        }
    }
    public static void main(String[] args)
    {
        String str ="   Pooja   Asane    ";
        RemoveWhiteSpacesString n = new RemoveWhiteSpacesString();
        n.removeWhiteSpaces(str);

    }
}
