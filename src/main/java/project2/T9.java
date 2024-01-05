package project2;
/* 9. Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.
*/
public class T9 {

    public static void main(String[] args) {
        String str = "abracadabra";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i), i + 1) == -1) {
                System.out.println("First non-repeating character is: " + str.charAt(i));
                break;
            }
        }
    }
}
