package queue;

import arraylist.Car;
import collection.CarCollection;

public interface CarQueue<T> extends CarCollection<T> {

    boolean add(T car);

    T peek();

    T poll();

}
