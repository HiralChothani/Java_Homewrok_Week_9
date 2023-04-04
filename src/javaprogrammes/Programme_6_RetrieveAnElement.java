package javaprogrammes;

import java.util.ArrayList;

/**
 *  Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {
    public static void main(String[] args) {

        // create object and calling instance method
        Programme_6_RetrieveAnElement obj = new Programme_6_RetrieveAnElement();
        obj.retrieveElement();
    }

    public void retrieveElement(){
        // Create a list and add some fruits to it
        ArrayList<String> list = new ArrayList<>();
        list.add("Strawberry");
        list.add("Plum");
        list.add("Jack fruit");
        list.add("Dragon fruit");
        list.add("Star fruit");
        list.add("Pineapple");
        list.add("Cherry");
        // Print the list
        System.out.println(list);
        // retrieve the first and last element
        String element = list.get(0);
        System.out.println("First element "+ element);
        element = list.get(6);
        System.out.println("Last element " + element);

    }
}