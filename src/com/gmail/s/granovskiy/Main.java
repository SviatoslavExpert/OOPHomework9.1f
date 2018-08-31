package com.gmail.s.granovskiy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        manipulateElements();
    }
    public static void manipulateElements() {
        //  creating a list
        List<Integer> a = new ArrayList<Integer>();
        //  adding elements to the list
        a.add(34);
        a.add(123);
        a.add(45);
        a.add(17);
        a.add(99);
        a.add(37);
        a.add(61);
        a.add(39);
        a.add(27);
        a.add(55);

        //  printing the original list
        System.out.println("This is the original list: ");
        System.out.println(Arrays.toString(a.toArray()));

        //  removing elements from the list
        a.remove(0);
        a.remove(0);
        a.remove(7);

        //  printing the updated list
        System.out.println();
        System.out.println("This is the updated list: ");
        System.out.println(Arrays.toString(a.toArray()));
    }
}
