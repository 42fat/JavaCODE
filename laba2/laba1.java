package ru.mephi.lab2;

import java.util.*;
import java.util.StringTokenizer;

public class laba1 {
    public static void main(String arg[]) {
//        key sting
//        value count
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        String str = " a aa a a ab a aab ab aa a aa a a ab a aab ab aab a aa a a ab a aab ab aabba aa a a ab a aab ab aab";
        String tmpStr;
        int tmpValue;
        StringTokenizer superStr = new StringTokenizer(str);
        while (superStr.hasMoreElements()) {
            tmpStr = superStr.nextToken();
            if (myMap.get(tmpStr) != null) {
                myMap.replace(tmpStr, myMap.get(tmpStr) + 1);

            } else {
                myMap.put(tmpStr, 1);
            }
        }
        System.out.println(Arrays.asList(myMap));

    }
}