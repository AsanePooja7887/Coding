package practice;

public class Vowel_con
{
    public static void main(String[] args) {
        String str = "Rani";
        String vowel ="" , consonet = "";
        for(int i =0 ;i< str.length();i++)
        {
            char c = Character.toLowerCase(str.charAt(i));
            if("aeiou".indexOf(c) != -1)
            {
                vowel+=c;
            }
            else
            {
                consonet+= c;
            }

        }
        System.out.println("Vowels:- "+vowel);
        System.out.println("Consonent :- "+consonet);
    }
}
