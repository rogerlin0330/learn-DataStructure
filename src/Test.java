import linearlist.LinearLists;
import org.jcp.xml.dsig.internal.SignerOutputStream;
import tree.binary.BiSortTree;
import tree.binary.BiTrees;

import java.util.*;

/**
 * Created by rogerlin on 2/1/17.
 */
public class Test {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        // test sort algorithm
        Integer[] numList;
        // test straightInsertionSort algorithm
        System.out.println("Test straightInsertionSort algorithm");
        System.out.println("------------------------------------------------");
        numList = new Integer[]{18, 8, 36, 11, 41, 59, 98, 27, 86, 89};
        System.out.println("Before: ");
        System.out.println(Arrays.asList(numList));
        LinearLists.straightInsertionSort(Arrays.asList(numList));
        System.out.println("After: ");
        System.out.println(Arrays.asList(numList));
        System.out.println();

        numList = new Integer[]{18, 8, 36, 11, 41, 59, 98, 27, 86, 89};
        System.out.println("Before: ");
        System.out.println(Arrays.asList(numList));
        LinearLists.straightInsertionSort(numList);
        System.out.println("After: ");
        System.out.println(Arrays.asList(numList));
        System.out.println();

        // test bubbleInsertionSort algorithm
        System.out.println("Test bubbleSort algorithm");
        System.out.println("------------------------------------------------");
        numList = new Integer[]{18, 8, 36, 11, 41, 59, 98, 27, 86, 89};
        System.out.println("Before: ");
        System.out.println(Arrays.asList(numList));
        LinearLists.bubbleSort(numList);
        System.out.println("After: ");
        System.out.println(Arrays.asList(numList));
        System.out.println();

        // test quickSort algorithm
        System.out.println("Test quickSort algorithm");
        System.out.println("------------------------------------------------");
        numList = new Integer[]{11, 8, 36, 11, 41, 59, 98, 27, 86, 89};
        System.out.println("Before: ");
        System.out.println(Arrays.asList(numList));
        LinearLists.quickSort(numList);
        System.out.println("After: ");
        System.out.println(Arrays.asList(numList));
        System.out.println();

        // test mergingSort algorithm
        System.out.println("Test mergingSort algorithm");
        System.out.println("------------------------------------------------");
        numList = new Integer[]{11, 8, 36, 11, 41, 59, 98, 27, 86, 89};
        System.out.println("Before: ");
        System.out.println(Arrays.asList(numList));
        LinearLists.mergingSort(numList);
        System.out.println("After: ");
        System.out.println(Arrays.asList(numList));
        System.out.println();

        // test BiSortTree
        System.out.println("BiSortTree");
        System.out.println("------------------------------------------------");
        int[] tree = new int[]{45, 24, 53, 45, 12, 24, 90, 67, 32, 5, 98, 10, 0, 8, 135, 25};
        BiSortTree biSortTree = new BiSortTree();
        for (int i : tree
             ) {
            biSortTree.insert(i);

        }
        System.out.println("PreOrderTraverse: ");
        BiTrees.preOrderTraverse(biSortTree.getRootNode());
        System.out.println();
        System.out.println("\nInOrderTraverse: ");
        BiTrees.inOrderTraverse(biSortTree.getRootNode());
        System.out.println();
        System.out.println("\nPostOrderTraverse: ");
        BiTrees.postOrderTraverse(biSortTree.getRootNode());
        System.out.println();

        // analyze average search length
        for (int i = 0; i < 10000; i++)
            biSortTree.find(tree[randomGenerator.nextInt(tree.length)]);
        System.out.println("\nAverage Search Length: " + biSortTree.getAvgSearchLength());
    }
}
