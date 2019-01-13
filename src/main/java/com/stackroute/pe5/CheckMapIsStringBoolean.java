/* Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CheckMapIsStringBoolean {
    public Map<String, Boolean> mapIsStringBoolean(String[] array) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                //comparing one element with other elements and increasing count//
                if (array[i].equals(array[j]))
                    count++;
            }

            if (count > 1) {
                map.put(array[i], true);
            } else
                map.put(array[i], false);
        }
        return map;
    }
}
