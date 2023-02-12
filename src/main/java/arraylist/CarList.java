package arraylist;

import collection.CarCollection;

public interface CarList<T> extends CarCollection<T> {

    T get(int index);

    boolean add(T car);

    boolean add(T car, int index);

    @Override
    boolean remove(T car);

    boolean removeAt(int index);

    int size();

    void clear();

    @Override
    boolean contains(T car);
}
