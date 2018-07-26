package ua.training.customarraylist;

public interface CustomList<E> extends Iterable<E> {
    int size();
    boolean add(E e);
    E get(int index);
    void set(int index, E e);
}
