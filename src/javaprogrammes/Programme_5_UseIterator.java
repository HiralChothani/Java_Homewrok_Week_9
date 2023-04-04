package javaprogrammes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme_5_UseIterator {
    public static void main(String[] args) {

        // calling static method
        Iterator();
    }

    public static void Iterator() {
        // Arraylist for generic object
        ArrayList<String> elements = new ArrayList<>();
        elements.add("∞");
        elements.add("Shree");
        elements.add("Krishna");
        elements.add("Sharanam");
        elements.add("Mamah");
        elements.add("∞");

        System.out.println(elements);

        // use of Iterator
        Iterator<String> list = elements.iterator();

        while (list.hasNext()) {
            String i = list.next();
            System.out.println(i);
        }

    }
}