/* Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive */
package com.stackroute.pe5;

import java.util.*;

public class SortingTheNames {
    public List<String> sortingTheNames(String[] inputstring) {
        //sorting the inputstring array//
        Set<String> setinputstring = new TreeSet<>();
        for (int i = 0; i < inputstring.length; i++)
            setinputstring.add(inputstring[i]);

        List<String> str = new ArrayList<>();
        Iterator<String> it = setinputstring.iterator();
        while (it.hasNext()) {
            str.add(it.next());
        }
        return str;
    }
}



