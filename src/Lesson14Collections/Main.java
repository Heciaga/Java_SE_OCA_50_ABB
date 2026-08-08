package Lesson14Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Haci");
        names.add("Sahil");
        names.add("Hesen");
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println(names.size());
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        List<String> cities = new ArrayList<>(
                List.of("Baku", "Ganja", "Sumqayit", "Shaki"));

        int index = cities.indexOf("Ganja");
        if (index != -1) System.out.println(cities.get(index));
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        List<String> fruits = new ArrayList<>(
                List.of("Apple", "Banana", "Orange"));
        index = fruits.indexOf("Banana");
        if (index != -1) {
            fruits.set(index, "Mango");
            System.out.println(fruits.get(index));
        }
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        List<Integer> numbers = new ArrayList<>(
                List.of(10, 20, 30, 40, 50)
        );
        index = numbers.indexOf(30);
        if (index != -1) {
            numbers.remove(index);
        }
        if (!numbers.isEmpty()) {
            numbers.removeFirst();
        }
        System.out.println(numbers);
        if (numbers.contains(40)) System.out.println("40 is exist");
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        List<String> names2 = new ArrayList<>(
                List.of("Ali", "Veli", "Hasan", "Ali", "Murad")
        );
        System.out.println(names2.indexOf("Ali"));
        System.out.println(names2.lastIndexOf("Alim"));
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        Set<String> distinctNames = new HashSet<>();
        for (String name : names2) {
            if (!distinctNames.add(name)) System.out.println("Dublicate: " + name);
        }
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) numbers.remove(numbers.indexOf(number));
        }
        System.out.println(uniqueNumbers);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        List<Integer> numbers2 = List.of(50, 10, 30, 20, 40);

        Set<Integer> hashSet = new HashSet<>(numbers2);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(numbers2);
        Set<Integer> treeSet = new TreeSet<>(numbers2);

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        Set<Integer> set1 = new HashSet<>(
                Set.of(1, 2, 3, 4, 5)
        );

        Set<Integer> set2 = new HashSet<>(
                Set.of(4, 5, 6, 7, 8)
        );
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        set1.removeAll(set2);
        System.out.println(set1);
        set1.addAll(set2);
        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);


    }
}
