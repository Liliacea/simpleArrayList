import java.util.Arrays;
import java.util.Iterator;


public class SimpleArrayList<E> implements Iterable<E> {
    SimpleArrayList<E> arrayList;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] values;
    private int size = 0;
    private int newSize = 15;

    public SimpleArrayList() {
        values = new Object[DEFAULT_CAPACITY];
    }

    public SimpleArrayList(int size) {
        arrayList = new SimpleArrayList<>(size);
        if (size < 0) {
            throw new IllegalArgumentException();
        }

    }

    public E get(int index) {

        return (E) values[index];
    }


    public void add(E value) {
        values[size] = value;
        size++;
        if (size > DEFAULT_CAPACITY-1) {
            grow(newSize);
        }


    }

    private Object[] grow(int newSize) {
        Object[] large = Arrays.copyOf(values, newSize);
        values = large;

        return values;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            @Override
            public boolean hasNext() {

                return false;
            }

            @Override
            public E next() {

                return null;
            }
        };
    }


    public int getSize() {

        return size;
    }
}


