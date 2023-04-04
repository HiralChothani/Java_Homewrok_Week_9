package javaprogrammes;

import java.util.ArrayList;

/**
 * Declare following two arraylist and compare it.
 */
public class Programme_11_CompareArrayList {
    public static void main(String[] args) {

        Programme_11_CompareArrayList obj = new Programme_11_CompareArrayList();
        obj.compareArray();
    }

    public void compareArray(){
        // First array list
        ArrayList<String> c1 = new ArrayList<>();
        // Add elements to list
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Second Array list
        ArrayList<String> c2 = new ArrayList<>();
        // Add elements to list
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Comparing both list
        boolean compare = c1.equals(c2);
        System.out.println(compare);

    }
}
