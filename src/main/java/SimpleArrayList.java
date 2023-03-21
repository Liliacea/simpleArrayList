import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class SimpleArrayList<E> implements Iterable<E> {
    SimpleArrayList<E> arrayList;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] values;
    private Object[] newValues;

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
    public  void delete (int index){
    newValues = new Object[values.length-1];
        System.arraycopy(values, 0, newValues, 0, index);
        System.arraycopy(values, index + 1, newValues, index, values.length - index - 1);
        size--;
        values = newValues;


    }

    private Object[] grow(int newSize) {
        Object[] large = Arrays.copyOf(values, (int) (size*1.5));
        values = large;

        return values;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

        int current = 0;
            @Override
            public boolean hasNext() {
            while (current<values.length) {
                return true;
            }
                return false;
            }

            @Override
            public E next() {
            if(!hasNext())
                throw new NoSuchElementException();
            else


                return (E) values[current++];
            }
        };
    }


    public int getSize() {

        return size;
    }

}


