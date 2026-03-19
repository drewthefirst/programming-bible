package com.programmingbible.dsa.hashtable;

import java.util.HashMap;

/*

    use a hashmap with each index as key and value being index 
    key : value / index
    {1: 0}
    {2: 1}
    {3: 2}
    {1: 3}

    if hashmap has key (number we're currently searching for) 
    & the difference of current index i and index already associated to key currently in map <=k

 */

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> dupeMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
          if(
            dupeMap.containsKey(nums[i]) && 
            Math.abs(dupeMap.get(nums[i]) - i) <= k)
            
            {
                return true;
            }
            dupeMap.put(nums[i], i);
        }
        return false;
    }
}
