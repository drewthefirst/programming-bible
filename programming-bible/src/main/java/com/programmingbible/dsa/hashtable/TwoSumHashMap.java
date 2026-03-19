package com.programmingbible.dsa.hashtable;


import java.util.HashMap;

public class TwoSumHashMap {
    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (prevMap.containsKey(difference)) {
                return new int[] { prevMap.get(difference), i };
            }
            prevMap.put(num, i);
        }

        return new int[] {};
    }
}
