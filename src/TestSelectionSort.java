public class TestSelectionSort {
    final static int ARRAY_LENGTH = 100000;
    long[] a = new long[ARRAY_LENGTH];

    public void creatArray() {
        for (long value : a) {
            value = Math.round(Math.random() * ARRAY_LENGTH);
        }
    }

    public void swap(long a, long b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public void selectionSortArray() {
        long min = a[0];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            for (int j = i +1 ; j < ARRAY_LENGTH; j++) {
                if (a[i] < a[j]) swap(a[i], a[j]);
            }
        }
    }

    public static void main(String[] args) {
        TestSelectionSort testSelectionSort = new TestSelectionSort();
        StopWatch stopWatch = new StopWatch();
        testSelectionSort.creatArray();
        stopWatch.setStartTime();
        testSelectionSort.selectionSortArray();
        stopWatch.setEndTime();
        long time = stopWatch.getElapsdTime();
        System.out.println("The time to sort " + ARRAY_LENGTH + " number is: " + time);
    }
}
