package com.programmingbible.dsa.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// we can sort the strings by character
// add each key to hashmap by sortedChars
// the value in the hashmap will be an arrayList of strings as this is mutable
// why hashmap as we will group the words by buckets(keys)
// return our list of strings as substrings     
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            // sort our str word
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String charKey = new String(charArr);

            map.putIfAbsent(charKey, new ArrayList<>());
            map.get(charKey).add(str);
        }
        return new ArrayList(map.values());
    }
}
