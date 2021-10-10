package ru.mephi.lab1;

public class Check {
     Object key;
     Object value;

    public Object getValue() {
        return value;
    }
    public Object getKey() {
        return key;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    Check(Object new_key, Object new_value) {
        key = new_key;
        value = new_value;
    }

    @Override
    public String toString() {
        return "{" +
                "" + key +
                ":" + value +
                '}';
    }
}

