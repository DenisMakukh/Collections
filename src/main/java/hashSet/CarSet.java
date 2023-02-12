package hashSet;

import arraylist.Car;
import collection.CarCollection;

public interface CarSet<T> extends CarCollection<T> {

    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();

    @Override
    boolean contains(T car);
}
