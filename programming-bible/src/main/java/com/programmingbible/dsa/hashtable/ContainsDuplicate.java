package com.programmingbible.dsa.hashtable;

import java.util.HashMap;

/*
-FACTS:
    -arrays only contain integer types
    -a duplicate is any number that is displayed more than once in our array

-INTUITION:
    -iterate through array
    -add each value to a HashMap - key: element, value:1
    -check if map containsKey if it already does we can return true
    -else we reach end of string and no key of same type is found return fals
*/

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>dupeHM = new HashMap<>();

        for(int num:nums){
            if(dupeHM.containsKey(num)){
                return true;
            }
            dupeHM.putIfAbsent(num, 1);
        }
        return false;
    }
}

