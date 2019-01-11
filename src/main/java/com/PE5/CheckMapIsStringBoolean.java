package com.PE5;

import java.util.HashMap;
import java.util.Map;

public class CheckMapIsStringBoolean {
    public Map<String,Boolean> mapIsStringBoolean(String[] arr)
    {
        Map< String ,Boolean> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i].equals(arr[j]))
                    count++;
            }

            if (count > 1)
            {
                map.put(arr[i], true);
            } else
                map.put(arr[i], false);
        }return map;
    }
}
