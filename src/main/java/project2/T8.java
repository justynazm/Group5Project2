package project2;

import java.util.ArrayList;

/* 8. You have a list of strings and you want to keep only those that
start with “A” and you want to return them in lower case".
*/
public class T8 {

        public static void main(String[] args) {
            ArrayList<String> words = new ArrayList<>();
            words.add("Cucumber");
            words.add("Pumpkin");
            words.add("Apple");
            words.add("Artichoke");
            words.add("Peach");

            for(int i=0; i<words.size(); i++){
                if(words.get(i).startsWith("A")){
                    words.set(i, words.get(i).toLowerCase());
                }
            }
            System.out.println(words);
        }
    }
