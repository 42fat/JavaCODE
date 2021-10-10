package ru.mephi.lab2;

import java.util.*;
import java.util.StringTokenizer;

public class laba2 {
    public static void main(String arg[]) {
//        key sting
//        value count
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        String str = " a aa a a ab a aab ab aa a aa a a ab a aab ab aab a aa a a ab a aab ab aabba aa a a ab a aab ab aab";
        String tmpStr;
        String newstring = new String();
        int tmpValue;
        StringTokenizer superStr = new StringTokenizer(str);
        while (superStr.hasMoreElements()) {
            tmpStr = superStr.nextToken();
            if (myMap.get(tmpStr) != null) {
            } else {
                myMap.put(tmpStr, 1);
                if(newstring.length()==0)
                {
                    newstring = tmpStr;
                }
                else{
                    newstring = newstring + " "+ tmpStr;
                }
            }
        }
        System.out.println(newstring);


        HashSet<String> h = new HashSet<String>();
        StringTokenizer superStr2 = new StringTokenizer(str);
        while (superStr2.hasMoreElements()){
            tmpStr = superStr2.nextToken();
            h.add(tmpStr);
        }
        System.out.println(h);
    }
}
