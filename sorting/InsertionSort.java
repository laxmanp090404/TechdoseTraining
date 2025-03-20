package sorting;

import java.util.Arrays;

public class InsertionSort {
      static void insertionSort(int[] arr) {
          int n = arr.length;
          for(int i=1;i<n;i++){
            int j = i;
            while (j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            // if wanted to sort till 4th element u use this code
            // if(i == 3){
            //     break;
            // }
          }
      }
      public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,6,2,4};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
                        System.out.println("After sorting");
                        System.out.println(Arrays.toString(arr));
                    }
        
}

