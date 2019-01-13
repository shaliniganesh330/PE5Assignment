/*Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheNumOfCount {
    public Map<String, Integer> toCountWordNumber(String inputstring) {
        Map<String, Integer> mapobject = new HashMap<String, Integer>();
        String[] words = inputstring.split("\\W|\\_|\\d");//non word character , hyphen and digit from 0-9
        for (String word : words) {
            String keyword = word.toLowerCase();
            //check whether the mapobject is contained and increase the count//
            if (mapobject.containsKey(keyword)) {
                mapobject.put(keyword, mapobject.get(keyword) + 1);
            } else {
                mapobject.put(keyword, 1);
            }
        }
        mapobject.remove("");
        return mapobject;
    }
}
