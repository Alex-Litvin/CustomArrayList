package ua.training.customarraylist;

import java.util.Iterator;

public class CustomIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] values;

    CustomIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
