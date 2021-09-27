package ru.mephi.hm1;

public class ObjectList {
    private static final int start_size = 10;
    private static final int extra_size = 5;
    private Object[] array = new Object[start_size];
    private int count = 0;


    public void add(Object value) {
        if (this.count == this.array.length - 1)
            resize((this.array.length) + extra_size);
        int i = 0;
        while (this.array[i] != null) {
            i++;
        }
        this.array[i] = value;
        this.count++;
    }

    public void add(Object value, int index) {
        if (this.count == this.array.length - 1)
            resize(array.length + extra_size);
        while (index > this.array.length - 1) {
            resize(array.length + extra_size);
        }
        int i = index;

        while (this.array[i] != null) {
            i++;
        }

        for (int j = i - 1; j >= index; j--) {
            this.array[j + 1] = this.array[j];
        }
        this.array[index] = value;
        this.count++;
    }

    public Object set(Object value, int index) {

        if (index > this.array.length) return null;
        Object deleted = this.array[index];
        this.array[index] = value;
        return deleted;

    }

    public Object remove(int index) {
        if (index > this.array.length) return null;
        if (index < 0) return null;
        Object deleted = this.array[index];
        int i = index;
        for (; i < this.array.length - 1 && this.array[i] != null; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[i] = null;
        this.count--;

        i = this.array.length - 1;
        while (this.array[i] == null && i > 0) {
            i--;
        }

        i = this.array.length - i;
        i = i / extra_size;
        int size = this.array.length - i * (this.extra_size);
        if (this.array.length - (this.extra_size) * i < this.start_size) size = this.start_size;
        if (i != 0) resize(size);

        return deleted;
    }

    public Object get(int index) {
        Object obj;
        if (this.array.length > index) obj = this.array[index];
        else obj = null;
        return obj;
    }

    public boolean contains(Object value) {
        boolean flag = false;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null) {
                if (this.array[i].equals(value)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public int indexOf(Object value) {
        int index = -1;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null) {
                if (this.array[i].equals(value)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    private void resize(int new_legth) {
        Object[] new_array = new Object[new_legth];
        int size = Math.min(new_legth, this.array.length);
        for (int i = 0; i < size; i++) {
            new_array[i] = this.array[i];
        }
        this.array = new_array;
    }

    public void printf() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}
