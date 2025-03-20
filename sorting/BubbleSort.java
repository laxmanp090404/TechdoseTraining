package sorting;

import java.util.Arrays;

public class BubbleSort {
     static void bubbleSort(int[] arr) {
       int n = arr.length;
        boolean swapOccured = false;

       for(int i=0;i<n;i++){
        swapOccured = false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapOccured = true;
            }
        }
        if(swapOccured == false){
            break;
        }
       }
    }
     public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,6,2,4};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
                System.out.println("After sorting");
                System.out.println(Arrays.toString(arr));
            }
        
}
