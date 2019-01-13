/*Write a Java program to update specific array element by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry] */
package com.stackroute.pe5;

import java.util.List;

public class UpdateSpecificArrayElement {
    public List<String> updateArrayElement(List<String> inputlist) {
        for (int i = 0; i < inputlist.size(); i++) {
            //updating the specific array element by given element//
            if (inputlist.get(i).equals("Apple")) {
                inputlist.remove(i);
                inputlist.add(i, "Kiwi");
            }
            if (inputlist.get(i).equals("Melon")) {
                inputlist.remove(i);
                inputlist.add(i, "Mango");
            }
        }
        return inputlist;
    }
}
