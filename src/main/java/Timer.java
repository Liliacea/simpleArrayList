public class Timer extends SimpleArrayList {

    public static void main(String[] args) {
        Integer[] values;
        SimpleArrayList<Integer> arrayList;
        values = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayList = new SimpleArrayList<>();
        for (int i = 0; i < 1200; i++) {
            arrayList.add(i);
        }
        long startRemoveCenter = System.nanoTime();
        arrayList.remove(600);
        System.out.println(System.nanoTime()-startRemoveCenter);

        long startDeleteCenter = System.nanoTime();
        arrayList.delete(600);
        System.out.println(System.nanoTime()-startDeleteCenter);

        long startRemoveEnd = System.nanoTime();
        arrayList.remove(1200);
        System.out.println(System.nanoTime() - startRemoveEnd);

        long startDeleteEnd = System.nanoTime();
        arrayList.delete(1200);
        System.out.println(System.nanoTime()-startDeleteEnd);

        long startRemoveTwoThirds = System.nanoTime();
        arrayList.remove(800);
        System.out.println(System.nanoTime() - startRemoveTwoThirds);

        long startDeleteTwoThirds = System.nanoTime();
        arrayList.delete(800);
        System.out.println(System.nanoTime() - startDeleteTwoThirds);

        long startRemoveFirst = System.nanoTime();
        arrayList.remove(1);
        System.out.println(System.nanoTime() - startRemoveFirst);

        long startDeleteFirst = System.nanoTime();
        arrayList.delete(800);
        System.out.println(System.nanoTime() - startDeleteFirst);

    }



}
