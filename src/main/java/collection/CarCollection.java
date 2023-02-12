package collection;

import arraylist.Car;
import arraylist.CarList;

public interface CarCollection<T> extends Iterable<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();

    boolean contains(T car);
}
