package ru.mephi.lab1;
import ru.mephi.hm1.*;

import javax.swing.*;

public class Map {
    private static final int start_size = 10;
    private static final int extra_size = 5;
    private Check[] array = new Check[start_size];
    private int count = 0;

    public void put(Object key, Object value) {
       Check ch = new Check(key,value);
        if(keyContains(key))return;
        if(count==array.length-1)
            resize(array.length+extra_size);
        array[count] = ch;
        count++;
    }
    public Object get(Object key){
        Object obj = null;
        if(isEmpty()) return obj;
        for(int i =0; i<count;i++)
        {
            if(array[i].getKey()==key) obj = array[i].getKey();
        }
        return obj;
    }
    public Object get(Object key, Object byDefault){
        Object obj;
        if((obj=get(key))!=null)
            return obj;
        else
            return get(byDefault);
    }
    public boolean keyContains(Object key) {
        boolean flag = false;
        if(isEmpty()) return flag;
        for (int i = 0; i < count; i++) {
            System.out.println(i);
            if(array[i].getKey()==key)
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
    public Object remove(Object key) {
        if(!keyContains(key))return null;
        Object obj = get(key);
        int index = 0;
        for(int i = 0; i<count;i++,index++)
        {
            if(obj==array[i].getKey())
                break;
        }
        if (count - index >= 0) System.arraycopy(array, index + 1, array, index, count - index);
        array[count] = null;
        count--;
        if(array.length>start_size && array.length-count>2*extra_size)
        {
            resize(array.length-extra_size);
        }
        return  obj;
    }
    private void resize(int length) {
        Check[] new_array = new Check[length];
        for(int i = 0;i<count;i++){
            new_array[i].setKey(array[i].getKey());
            new_array[i].setValue(array[i].getValue());
        }
        array = new_array ;
    }
    public ObjectList getKeys(){
        if(isEmpty())return null;
        ObjectList list = new ObjectList();
        for(int i =0 ; i<count;i++)
            list.add(array[i].getKey());
        return list;
    }
    public ObjectList getValues(){
        if(isEmpty())return null;
        ObjectList list = new ObjectList();
        for(int i =0 ; i<count;i++)
            list.add(array[i].getValue());
        return list;
    }
    public ObjectList getEntries(){
        if(isEmpty())return null;
        ObjectList list = new ObjectList();
        for(int i =0 ; i<count;i++)
            list.add(array[i]);
        return list;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty()
    {
        return count==0;
    }

}
