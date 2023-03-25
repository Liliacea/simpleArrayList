import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNull;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Test simpleArrayList
 */

public class SimpleArrayListTest {

    Integer[] values;
    SimpleArrayList<Integer> arrayList;

    /**
     * Initialize
     */
    @Before
    public void setUp() {
        values = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayList = new SimpleArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
    }

    /**
     * get return value by index
     */

    @Test()
    public void get() {

        assertThat(arrayList.get(2), is(3));
    }

    /**
     * arrayList size is The number of elements
     */
    @Test
    public void add() {
        assertThat(arrayList.getSize(), is(3));
    }

    /**
     * arraylist increases capacity.
     */
    @Test
    public void addALotAndGrowUp() {
        values = new Integer[]{1, 2, 3};
        arrayList = new SimpleArrayList<>();

        for (int i = 0; i < 200; i++) {
            arrayList.add(i);
        }


    }

    /**
     * deleting reduces the arrayList size by the number of elements removed
     */
    @Test
    public void delete() {
        arrayList.delete(1);
        assertThat(arrayList.getSize(), is(2));
    }

    /**
     *  deleting don't reduse the arrayList size, but adds null at the end of array
     */
    @Test
    public void remove() {
        arrayList.remove(1);
        assertNull(arrayList.get(2));
        assertThat(arrayList.getSize(), is(3));
        assertThat(arrayList.get(0), is(1));
        assertThat(arrayList.get(1), is(3));
        arrayList.remove(0);
        assertNull(arrayList.get(1));
        assertThat(arrayList.get(0),is(3));
    }

    /**
     * return arrayList size
     */

    @Test
    public void getSize() {
        assertThat(arrayList.getSize(),is(3));
    }

    /**
     * If the item does not exist, an exception is thrown.
     */

    @Test(expected = NoSuchElementException.class)
    public void iteratorHasNextNextSequentialInvocation() {

        Iterator<Integer> it = arrayList.iterator();
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(1));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(3));
        assertThat(it.hasNext(), is(false));
        it.next();
    }
    /**
     * Wrong order of invocation.
     */
    @Test(expected = NoSuchElementException.class)
    public void sequentialHasNextInvocationDoesntAffectRetrievalOrder() {
        Iterator<Integer> it = arrayList.iterator();
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(1));
        assertThat(it.next(), is(2));
        assertThat(it.next(), is(3));
        it.next();
    }
    /**
     * Multiply invocation of hasNext return the same values
     */
    @Test
    public void hasNextReturnTheSameValues() {
        Iterator<Integer> it = arrayList.iterator();
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
    }


}

