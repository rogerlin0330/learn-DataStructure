package linearlist;

import java.util.*;

/**
 * Created by rogerlin on 2/2/17.
 */
public class LinearLists {
    // search algorithm
    public static <T> T seqSearch(List<? extends Comparable<T>> list, T key) {
        T element = null;
        return element;
    }

    public static <T> T biSearch(List<? extends Comparable<T>> list, T key) {
        T element = null;
        return element;
    }

    // sort algorithm
    // insertion sort
    public static <T extends Comparable<T>> void straightInsertionSort(T[] list) {
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(list[i - 1]) < 0) {
                T temp = list[i];
                int j;
                for (j = i - 1; j >= 0 && list[j].compareTo(temp) > 0; j--)
                    list[j + 1] = list[j];  // move the element backward
                list[j + 1] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> void straightInsertionSort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                T temp = list.get(i);
                int j;
                for (j = i - 1; j >= 0 && list.get(j).compareTo(temp) > 0; j--)
                    list.set(j + 1, list.get(j));
                list.set(j + 1, temp);
            }
        }
    }

    public static <T extends Comparable<T>> void biInsertionSort(T[] list) {
    }

    public static <T extends Comparable<T>> void biInsertionSort(List<T> list) {
    }

    public static <T extends Comparable<T>> void shellInsertionSort(T[] list) {
    }

    public static <T extends Comparable<T>> void shellInsertionSort(List<T> list) {
    }

    // quick sort
    public static <T extends Comparable<T>> void bubbleSort(T[] list) {
        for (int i = 0; i < list.length - 1; i++) { // need (list.length -1) bubble rounds
            for (int j = list.length - 1; j > i; j--) { // need (list.length - i - 1) bubble times in each round
                if (list[j - 1].compareTo(list[j]) > 0) {
                    T temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(List<T> list) {
    }

    private static <T extends Comparable<T>> void quickSort(T[] list, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    private static <T extends Comparable<? super T>> int partition(T[] list, int first, int last) {
        T pivot = list[first];  // chose the first index as pivot
        int low = first + 1;
        int high = last;
        while (low < high) {
            while (low <= high && list[low].compareTo(pivot) <= 0)
                low++;

            while (low <= high && list[high].compareTo(pivot) > 0)
                high--;

            if (high > low) {
                T temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }

        while (high > first && list[high].compareTo(pivot) == 0)
            high--;

        if (pivot.compareTo(list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static <T extends Comparable<T>> void quickSort(List<T> list) {
    }

    // selection sort
    public static <T extends Comparable<T>> void simpleSelectionSort(T[] list) {
    }

    public static <T extends Comparable<T>> void simpleSelectionSort(List<T> list) {
    }

    public static <T extends Comparable<T>> void heapSort(T[] list) {
    }

    public static <T extends Comparable<T>> void heapSort(List<T> list) {
    }

    // merging sort
    private static <T extends Comparable<T>> T[] merge(T[] list1, T[] list2) {
        T[] temp = (T[]) new Comparable[list1.length + list2.length];

        int current1 = 0, current2 = 0, current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1].compareTo(list2[current2]) < 0) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];

        return temp;
    }

    public static <T extends Comparable<T>> void mergingSort(T[] list) {
        if (list.length > 1) {
            int splitor = list.length / 2;
            T[] firstHalf = (T[]) new Comparable[splitor];
            System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
            mergingSort(firstHalf);

            T[] secondHalf = (T[]) new Comparable[list.length - splitor];
            System.arraycopy(list, splitor, secondHalf, 0, secondHalf.length);
            mergingSort(secondHalf);

            T[] temp = merge(firstHalf, secondHalf);
            System.arraycopy(temp, 0, list, 0, temp.length);
        }
    }

    public static <T extends Comparable<T>> void mergingSort(List<T> list) {
    }
}
