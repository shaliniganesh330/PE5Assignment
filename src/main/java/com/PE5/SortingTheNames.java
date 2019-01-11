package com.PE5;

import java.util.*;

public class SortingTheNames {
    public List<String> sortingTheNames(String[] inputstring) {
        Set<String> setinput = new TreeSet<>();
        for (String s : inputstring)
            setinput.add(s);

        List<String> str = new ArrayList<>();
        Iterator<String> it = setinput.iterator();
        while (it.hasNext()) {
            str.add(it.next());
        }
        return str;
    }
}

//    public static void main(String[] args) {
//
//
//        String[] inputstring = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
//        SortingTheNames ob = new SortingTheNames();
//        System.out.println(ob.sortingTheNames(inputstring));
//    }
