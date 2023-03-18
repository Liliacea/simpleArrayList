public class Check {
    public static void main(String[] args) {
        Integer[] values = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SimpleArrayList<Integer> arrayList = new SimpleArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);




        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
