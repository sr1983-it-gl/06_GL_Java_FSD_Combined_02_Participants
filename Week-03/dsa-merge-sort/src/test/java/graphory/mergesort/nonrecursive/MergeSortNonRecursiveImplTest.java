package graphory.mergesort.nonrecursive;

import gl.mergesort.nonrecursive.MergeSortNonRecursiveImpl;

public class MergeSortNonRecursiveImplTest {

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
		int[] arr = {8, 2, 6, 4, 5, 3, 7, 1};

//        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
     
        System.out.printf("Given array is \n");
                
        MergeSortNonRecursiveImpl.printArray(arr, n);
     
        MergeSortNonRecursiveImpl.mergeSort(arr, n);
     
        System.out.printf("\nSorted array is \n");
        MergeSortNonRecursiveImpl.printArray(arr, n);
    }
	

}
