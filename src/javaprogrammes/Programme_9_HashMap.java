package javaprogrammes;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {

        forEachLoop();
    }

    public static void forEachLoop(){
        // Create HashMap object
        HashMap<String, Integer> people = new HashMap<>();

        //Add keys and values ("name", age)
        people.put("Radha", 20);
        people.put("Terry", 40);
        people.put("Max", 100);
        people.put("Alex", 57);
        people.put("Steve", 86);
        people.put("tom", 69);
        System.out.println(people);

        // Print values using for each loop
        for (Integer i : people.values()) {
            System.out.println(i);
        }

    }
}
