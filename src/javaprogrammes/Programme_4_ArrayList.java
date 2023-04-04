package javaprogrammes;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */
public class Programme_4_ArrayList {
    // creating new arraylist
    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        //object creation
        Programme_4_ArrayList obj = new Programme_4_ArrayList();
        obj.addColorsToTheList();
    }

        public void addColorsToTheList() {
            // Add colours to the list
            list.add("Peony");
            list.add("Raspberry pink");
            list.add("angel blue");
            list.add("Forest Green");
            list.add("Glacier blue");
            list.add("Sunshine yellow");

            for(String colours : list){
                System.out.println(list);
                break;
            }
        }

    }
