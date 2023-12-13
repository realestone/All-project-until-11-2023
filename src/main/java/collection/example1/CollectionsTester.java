package collection.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class CollectionsTester {
    public static void main(String[] args) {

        List<Integer> luckyNumber = new ArrayList<>();
        luckyNumber.add(4);
        luckyNumber.add(7);
        luckyNumber.add(1);

        luckyNumber.forEach(System.out::println);

        //Esminiai seto features
        //Unikalios reiksmes, nera eiles tvarkos.
        Set<String> luckyNames = new HashSet<>();
        luckyNames.add("Mantas");
        luckyNames.add("Tauvis");
        luckyNames.add("Goda");
        luckyNames.add("Mantas");
        luckyNames.add("Lukas");

        luckyNames.forEach(System.out::println);
        luckyNames.remove("Tautvis");
        System.out.println();
        luckyNames.forEach(System.out::println);

        System.out.println();
        Map<Integer, Computer> computerMap = new HashMap<>();
        computerMap.put(5, new Computer("Dell Cool Machine"));

        Computer apple = new Computer("Apple Hot Machine");
        computerMap.put(3, apple);

        System.out.println(computerMap);

        Collections values = (Collections) computerMap.values(); //istraukia visus mapo/zodyno reiksmes
        System.out.println(values);

        Set<Integer> keys = computerMap.keySet(); //istraukia visus mapo raktus

        Set<Map.Entry<Integer, Computer>> entries = computerMap.entrySet();

        for (Integer raktas : computerMap.keySet()) {
            System.out.println(raktas);
        }

        for (Computer kompas : computerMap.values()) {
            System.out.println(kompas);
        }

        for(Map.Entry<Integer, Computer> singleEntry : computerMap.entrySet()) {
            singleEntry.getKey();
            singleEntry.getValue();

        }



    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Computer {
        private String name;
    }
}

