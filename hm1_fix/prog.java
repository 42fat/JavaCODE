package ru.mephi.lab1;
import ru.mephi.hm1.ObjectList;
public class prog {
    public static void main(String arg[])
    {
        Map map = new Map();

        map.put(124,213);
        map.put(124,"213u");
        map.put("124s",213);
        map.put("124a","213n");
        map.put(null,null);

        System.out.println(map.isEmpty());
        System.out.println(map.keyContains(124));
        System.out.println(map.size());
        System.out.println(map.get(1245,"213u"));
        ObjectList list1,list2,list12;
        list1=map.getValues();
        list2=map.getKeys();
        list12=map.getEntries();
        list1.printf();
        list2.printf();
        list12.printf();
    }
}
