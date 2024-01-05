package project2;
/* 7. Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or punctuation.
For example, the input "Hello, world!" should return 2.
 */

public class T7 {
    public static void main(String[] args) {

        String str = "Hello, world!";
        String[]array=str.split(" ");
        int str1 = array.length;

        System.out.println("Number of words in a String is: "+str1);

    }

    }
