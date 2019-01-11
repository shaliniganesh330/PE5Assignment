package com.PE5;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReplaceTheMapValues {
   public Map<String,String> replaceTheValue(Map<String,String> inputstring)
   {
       String val1= inputstring.get("val1");
       inputstring.put("val1"," ");
       inputstring.put("val2",val1);
       System.out.println(inputstring);
       return inputstring;
   }

}
