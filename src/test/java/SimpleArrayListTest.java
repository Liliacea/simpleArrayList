import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class SimpleArrayListTest {
    Integer[] values;
    SimpleArrayList<Integer> arrayList;

    @BeforeEach
    public void setUp() {
        values = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayList = new SimpleArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
    }

    @Test
    void get() {

        assertThat(arrayList.get(2), is(3));
    }

    

    @Test
    void delete() {
    }

    @Test
    void iterator() {
    }

    @Test
    void getSize() {
    }
}