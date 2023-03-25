public class Timer extends SimpleArrayList {

    public static void main(String[] args) {
        Integer[] values;
        SimpleArrayList<Integer> arrayList;
        values = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayList = new SimpleArrayList<>();
        for (int i = 0; i < 600; i++) {
            arrayList.add(i);
        }

        long m = System.currentTimeMillis();

        System.out.println(m);
    }
}
