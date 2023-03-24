import java.util.*;

/**
 * Create of simpleArrayList
 * DEFAULT_CAPACITY of array = 10
 * arrayList grows in 1.5, when capacity of array is exceeded
 *
 * @param <E>
 */
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

    /**
     * @param index
     * @return value by index
     */
    public E get(int index) {

        return (E) values[index];
    }

    /**
     * add new elements
     *
     * @param value
     */
    public void add(E value) {
        values[size] = value;
        size++;
        if (size > DEFAULT_CAPACITY - 1) {
            grow(newSize);
        }


    }

    /**
     * delete elements by index
     *
     * @param index
     */
    public void delete(int index) {
        newValues = new Object[values.length - 1];
        System.arraycopy(values, 0, newValues, 0, index);
        System.arraycopy(values, index + 1, newValues, index, values.length - index - 1);
        size--;
        values = newValues;


    }

    /**
     * delete items by index without size changes
     * @param index
     * @return E
     */
    public E remove(int index) {
        Objects.checkIndex(index, values.length);
        @SuppressWarnings("unchecked") E oldValue = (E) values[index];
        fastRemove(values, index);

        return oldValue;
    }

    /**
     * supporting method for remove
     * @param es
     * @param i
     */

    private void fastRemove(Object[] es, int i) {
        size++;
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }


    /**
     * method allows increase arraylist.
     * invocated in add
     *
     * @param newSize
     * @return
     */

    private Object[] grow(int newSize) {
        Object[] large = Arrays.copyOf(values, (int) (size * 1.5));
        values = large;

        return values;
    }

    /**
     * iterator
     *
     * @return iterator
     */

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            int current = 0;

            @Override
            public boolean hasNext() {
                while (current < values.length - 1 && values[current] != null) {
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                else


                    return (E) values[current++];
            }
        };
    }

    /**
     * @return arrayList size
     */

    public int getSize() {

        return size;
    }

}


