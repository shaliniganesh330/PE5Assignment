/* Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key 'val1' has a value,set the key 'val2' to have that value,and b. set the key 'val1' to have the value " " */
package com.stackroute.pe5;

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
