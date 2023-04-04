package javaprogrammes;

import java.util.ArrayList;

public class Programme_7_CheckIfStringIsEmpty {

    public static void main(String[] args) {
     checkString();
    }

    public static void checkString(){
        //Create arraylist and add elements
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        // Print the list
        System.out.println("Original Array list : " + number);
        // check if arraylist is empty
        System.out.println("Is array list empty? " + number.isEmpty());
        // remove all elements from list
        number.removeAll(number);
        System.out.println("Array list after removing all elements : " + number);
        // check if array list is empty
        System.out.println("Is array list empty ? " + number.isEmpty());

    }
}
