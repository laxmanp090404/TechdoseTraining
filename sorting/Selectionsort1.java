    package sorting;

import java.util.Arrays;

public class Selectionsort1 {
        public static void selectionSort(int a[]){
            int n = a.length;
            int minIdx;
            for(int i=0;i<n-1;i++){
                minIdx = i;
                for(int j=i+1;j<n;j++){
                    if(a[j] < a[minIdx]){
                        minIdx = j;
                    }
                }
                if(minIdx!=i){
                    swap(a,minIdx,i);
                }
            }
            System.out.println(Arrays.toString(a));
        }
        public static void swap(int[] a,int x,int y){
           int n1 = a[x];
           int n2 = a[y];
           n1 = n1^n2;
           n2 = n1^n2;
           n1 = n1^n2;

        }
        public static void main(String[] args) {
            int[] a = {4,2,5,1,3};
        selectionSort(a);
        }
    }
