
/*
 * *** Amol Sayala Section 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

        // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
        if (setA == null && setB == null) {
            return null;
        }
        if (setA == null) {
            return new TreeSet<>(setB);  // If setA is null, return a new TreeSet containing elements from setB
        }
        if (setB == null) {
            return new TreeSet<>(setA);  // If setB is null, return a new TreeSet containing elements from setA
        }
        Set<Integer> result = new TreeSet<>(setA);
        result.removeAll(setB);

        Set<Integer> temp = new TreeSet<>(setB);
        temp.removeAll(setA);

        result.addAll(temp);




        return result;
        // This can be done numerous ways, but once such will only that
        // *several* lines of code. Hint: create two temporary TreeSets and utilize the
        // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
    }


    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {

        // INSERT CODE HERE.
        if (treeMap == null) {
            return;
        }

        Iterator<Integer> iterator = treeMap.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();

            if (key % 2 == 0) {
                iterator.remove();  // Safely remove even keys
            }
        }


        return;
    }


    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

        // INSERT CODE HERE
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }

        return tree1.equals(tree2);

    }

} // end treeProblems class
