package Lecture15;

import java.util.*;

//import java.util.Map;
public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> hp = new HashMap<>();

        hp.put(1, "HI");
        hp.put(2, "HELLO");
        hp.put(3, "NAMASTE");
        hp.put(4, "SALAM");
        hp.put(5, "KEM CHHO");
        hp.put(6, "MAJAMA");

        // Access a value
        System.out.println(hp.get(3));
        // view
        System.out.println(hp);
        // remove
        // System.out.println(hp.remove());

        // Iterating over a Hashmap
        for (Map.Entry m : hp.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
