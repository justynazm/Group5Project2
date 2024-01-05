package project2;
// 10. How can you remove all duplicates from ArrayList?

import java.util.ArrayList;
import java.util.List;

public class T10 {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("orange");

        List<String> listWithoutDuplicates = new ArrayList<>();

        for (String element : listWithDuplicates) {
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }
        }

        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}

