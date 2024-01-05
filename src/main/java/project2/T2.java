package project2;
// 2. Find out how many alpha characters are present in a string?
public class T2 {

    public static void main(String[] args) {
        String str = "Hello, Batch18! How are you?";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Number of alpha characters: " + count);
    }
}
