package project2;
/* 6. Create a method to count how many vowels are present in a string
“documentation”
*/
public class T6 {
    public static int countVowels(String input) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word = "documentation";
        int numOfVowels = countVowels(word);
        System.out.println("The number of vowels in the string: " + numOfVowels);
    }
}

