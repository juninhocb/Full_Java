package utils.sorts;

public class MySorts {
    private static int counter;
    public static <T extends Comparable<T>> T[] bubbleSort(T[] arrayInput){

        for (int i = 0; i < arrayInput.length - 1; i++){
            for (int j = 0; j < arrayInput.length - i - 1; j ++){
                if (arrayInput[j].compareTo(arrayInput[j+1]) > 0){
                    swap(j, j+1, arrayInput);  //pass arrayInput as value (with copy of reference)
                }
            }
        }
        finishSort();
        return arrayInput;
    }

    public static <T extends Comparable<T>> T[] selectSort(T[] arrayInput) {
        for (int i = 0; i < arrayInput.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayInput.length; j++) {
                if (arrayInput[j].compareTo(arrayInput[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(i, minIndex, arrayInput);
            }
        }
        finishSort();
        return arrayInput;
    }


    public static <T extends Comparable<T>> T[] quickSort(T[] arrayInput) {
        quickSort(arrayInput, 0, arrayInput.length - 1);
        finishSort();
        return arrayInput;
    }

    private static <T extends Comparable<T>> void quickSort(T[] arrayInput, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(arrayInput, left, right);
        quickSort(arrayInput, left, pivotIndex - 1);
        quickSort(arrayInput, pivotIndex + 1, right);
    }

    private static <T extends Comparable<T>> int partition(T[] arrayInput, int left, int right) {
        T pivotValue = arrayInput[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arrayInput[j].compareTo(pivotValue) <= 0) {
                i++;
                swap(j, i, arrayInput);
            }
        }
        swap(right, i + 1, arrayInput);
        return i + 1;
    }


    private static void finishSort(){
        System.out.println(String.format(" \n This sorter swapped %d times", counter));
        counter = 0;
    }


    private static <T> void swap(int i, int j, T[] arrayInput){
        T t = arrayInput[i];
        arrayInput[i] = arrayInput[j];
        arrayInput[j] = t;
        counter++;
    }

}
