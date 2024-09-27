package sorting;
import java.util.*;
public class Mergesort {
    public static void mergeSort(int[] a, int low, int high){
     if(low == high){
        return;
     }
     int mid = (low+high)/2;
     mergeSort(a,low,mid);
     mergeSort(a,mid+1,high);
     mergeArray(a,low,mid,high);
    }
    public static void mergeArray(int[] a,int low,int mid,int high){
       int[] temp =  new int[high-low+1];
       int left = low;
       int right = mid+1;
       int i = 0;
       while(left<=mid && right<=high){
        if(a[left]<a[right]){
            temp[i++] = a[left];
            left++;
        }
        else{
            temp[i++] = a[right];
            right++;
        }

       }

       // arr 1 is remaining
       while(left<=mid){
        temp[i] = a[left];
        left++;
        i++;
       }

       //if arr2 is remaining
       while(right<=high){
        temp[i] = a[right];
        right++;
        i++;
       }

       //copying temp to original array
       for(int idx=low;idx<=high;idx++){
        a[idx] = temp[idx-low];
       }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,6,2,4};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
}
