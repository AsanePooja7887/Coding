package practice;

public class RemoveOccOfString
{
    public static void main(String[] args) {
        String input = "harsh jay kiran harsh jay";
        String wordToRemove = "harsh";

        // Split the string into words
        String[] words = input.split(" ");

        // Build the final string excluding the word to remove
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                result.append(word).append(" ");
            }
        }

        // Trim the last space
        String output = result.toString().trim();

        System.out.println("Original: " + input);
        System.out.println("After removing '" + wordToRemove + "': " + output);
    }
}
