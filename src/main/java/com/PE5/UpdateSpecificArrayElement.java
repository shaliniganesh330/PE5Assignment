package com.PE5;

import java.util.List;

public class UpdateSpecificArrayElement
{
    public List<String> updateArrayElement(List<String> inputlist)
    {
        for (int i = 0; i < inputlist.size(); i++)
        {
            if (inputlist.get(i).equals("Apple"))
            {
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
