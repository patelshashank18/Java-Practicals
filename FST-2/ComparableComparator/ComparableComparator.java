package ComparableComparator;

import java.util.*;

/**
 * Practical 19:
 * Write a program to find the index of an array element.
 *
 * Demonstrates:
 * Array, List, Set, Map, Comparable and Comparator.
 */
public class ComparableComparator {

    public static void main(String[] args) {

        /**
         * Condition 1: Find index of an array element.
         */
        int[] arr = { 10, 20, 30, 40, 50 };
        int search = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Index: " + i);
                break;
            }
        }

        /**
         * Condition 2: List.
         */
        List<Element> list = new ArrayList<>();

        list.add(new Element(3, "Rahul", 70));
        list.add(new Element(1, "Jigar", 90));
        list.add(new Element(2, "Amit", 80));

        System.out.println("List: " + list);

        /**
         * Condition 3: Set.
         */
        Set<String> set = new HashSet<>();

        set.add("Jigar");
        set.add("Rahul");
        set.add("Jigar");

        System.out.println("Set: " + set);

        /**
         * Condition 4: Map.
         */
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Jigar");
        map.put(2, "Rahul");

        System.out.println("Map: " + map);

        /**
         * Condition 5: Comparable - Sort by ID.
         */
        Collections.sort(list);
        System.out.println("By ID: " + list);

        /**
         * Condition 6: Comparator - Sort by Name.
         */
        Collections.sort(list, new SortByName());
        System.out.println("By Name: " + list);

        /**
         * Condition 7: Comparator - Sort by Marks.
         */
        Collections.sort(list, new SortByMarks());
        System.out.println("By Marks: " + list);
    }
}