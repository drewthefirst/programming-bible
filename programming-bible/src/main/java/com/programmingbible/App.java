package com.programmingbible;

import java.util.Arrays;

import com.programmingbible.core.fundamentals.MyHashMap;
import com.programmingbible.core.fundamentals.MyNode;
import com.programmingbible.dsa.hashtable.ContainsDuplicate;
import com.programmingbible.dsa.hashtable.ContainsDuplicateII;
import com.programmingbible.dsa.hashtable.GroupAnagrams;
import com.programmingbible.dsa.hashtable.TwoSumHashMap;
import com.programmingbible.dsa.linkedlist.ReverseLinkedList;
import com.programmingbible.dsa.linkedlist.ReverseLinkedList.ListNode;
import com.programmingbible.dsa.slidingwindow.BestTimeToBuyAndSellStock;

/**
MAKE GENERIC TYPE FOR USE ACROSS CLASSES with data type declaration.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyNode <Integer>node = new MyNode(10);
        node.setNextNode(new MyNode<Integer>(98));
        System.out.println(node);

        MyHashMap myMap = new MyHashMap();
        myMap.put(10,11);
        System.out.println(myMap.get(10));

        TwoSumHashMap twoSumHashMap = new TwoSumHashMap();
        int []twoSum = twoSumHashMap.twoSumHashMap(new int[]{1,3,7,4,5,9},10);
        int [] arrayContainsDuplicate = new int[]{1,3,7,3,5,9};

        System.out.println(Arrays.toString(twoSum));
        
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println("does two sum array also contain duplicate " + cd.containsDuplicate(twoSum));

        ContainsDuplicateII cd2 = new ContainsDuplicateII();
        System.out.println("does two sum array also contain duplicate within k elements away " + cd2.containsNearbyDuplicate(arrayContainsDuplicate, 2));

        String [] groupStrings = new String[]{"hat", "aht", "tah", "bad", "abd", "sand", "crabs"};
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.groupAnagrams(groupStrings));


        ReverseLinkedList reverseList = new ReverseLinkedList();
        ListNode dummyNode = new ListNode(11, null);
        System.out.println(reverseList.reverseList((dummyNode)));

        BestTimeToBuyAndSellStock buySellStock = new BestTimeToBuyAndSellStock();
        int [] prices = new int[]{10,3,15,12,12,18,16};
        System.out.println(buySellStock.maxProfit(prices));
        

    }
}
