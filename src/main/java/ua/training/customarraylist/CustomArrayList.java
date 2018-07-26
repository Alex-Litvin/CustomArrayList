package ua.training.customarraylist;

import java.util.Iterator;

public class CustomArrayList<E> implements CustomList<E> {
    private E[] values;

    CustomArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean add(E e) {
        E[] temporary = values;
        values = (E[]) new Object[temporary.length + 1];
        System.arraycopy(temporary, 0, values, 0, temporary.length);
        values[values.length - 1] = e;
        return false;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void set(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomIterator<>(values);
    }
}
