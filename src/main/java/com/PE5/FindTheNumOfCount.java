package com.PE5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheNumOfCount
{
    public Map<String,Integer> toCountWordNumber(String string)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] words = string.split("\\W|\\_|\\d");//non word character  hyphen and digit from 0-9
        for (String word : words) {
            String keyword = word.toLowerCase();
            if (map.containsKey(keyword)) {
                map.put(keyword, map.get(keyword) + 1);
            } else {
                map.put(keyword, 1);
            }
        }
        map.remove("");
        return map;
    }
}
