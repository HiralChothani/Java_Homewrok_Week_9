package javaprogrammes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_Zone1LineAndStations {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> linePassing = new HashMap<>();
        linePassing.put("Angle", new ArrayList<>());
        linePassing.get("Angle").add("Northern Line");

        linePassing.put("OxfordCircus", new ArrayList<>());
        linePassing.get("OxfordCircus").add("Bakerloo Line");
        linePassing.get("OxfordCircus").add("Central Line");
        linePassing.get("OxfordCircus").add("Victoria Line");

        linePassing.put("King'sCross", new ArrayList<>());
        linePassing.get("King'sCross").add("Circle Line");
        linePassing.get("King'sCross").add("Piccadilly Line");
        linePassing.get("King'sCross").add("Hammersmith & City");
        linePassing.get("King'sCross").add("Northern");
        linePassing.get("King'sCross").add("Metropolitan");
        linePassing.get("King'sCross").add("Victoria");


        linePassing.put("Bank", new ArrayList<>());
        linePassing.get("Bank").add("Northern Line");
        linePassing.get("Bank").add("Central Line");
        linePassing.get("Bank").add("Waterloo & City Line");
        linePassing.get("Bank").add("DLR");

        linePassing.put("CharingCross", new ArrayList<>());
        linePassing.get("CharingCross").add("Bakerloo Line");
        linePassing.get("CharingCross").add("Northern Line");

        HashMap<String, String> tubeZone = new HashMap<>();
        tubeZone.put("Angle", "Zone 1");
        tubeZone.put("OxfordCircus", "Zone 1");
        tubeZone.put("King'sCross", "Zone 1");
        tubeZone.put("Bank", "Zone 1");
        tubeZone.put("CharingCross", "Zone 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the station name : ");
        String nameOfStation = sc.next();
        System.out.println("Lines passing through "+ nameOfStation + " is " + linePassing.get(nameOfStation));
        System.out.println(nameOfStation + " is in the "+ tubeZone.get(nameOfStation));

        sc.close();

    }

}
