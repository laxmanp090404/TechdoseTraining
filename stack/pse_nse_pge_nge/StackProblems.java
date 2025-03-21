package stack.pse_nse_pge_nge;

import java.util.Stack;
import java.util.Arrays;

public class StackProblems {
    public static int[] previousSmallerElement(int[] arr) {
        int[] pse = new int[arr.length];
        int n = arr.length;
        Arrays.fill(pse, -1); // Default values
        Stack<Integer> st = new Stack<>();

        // Implement PSE logic here
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                pse[i] = -1;
                st.push(arr[i]);
            }
            else{
                int val = st.peek();
                while(!st.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    pse[i] = -1;
                    st.push(arr[i]);
                }
                else{
                    pse[i] = st.peek();
                    st.push(arr[i]);
                }
            }
        }

        return pse;
    }

    public static int[] nextSmallerElement(int[] arr) {
         int n = arr.length;
        int[] nse = new int[arr.length];
        Arrays.fill(nse, -1);
        Stack<Integer> st = new Stack<>();
        
        // Implement NSE logic here
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                nse[i] = -1;
                st.push(arr[i]);
            }
            else{
                int val = st.peek();
                if(val <arr[i]){
                    nse[i] = val;
                    st.push(arr[i]);
                }
                else{
                    while(!st.isEmpty() && st.peek()>=arr[i]){
                        st.pop();
                        }
                        if(st.isEmpty()){
                            nse[i] = -1;
                            st.push(arr[i]);
                        }
                        else{
                            nse[i] = st.peek();
                            st.push(arr[i]);
                        }
                }
            }
        }
        
        return nse;
    }

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Arrays.fill(nge, -1);
        Stack<Integer> stack = new Stack<>();

        // Implement NGE logic here
        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty()){
                nge[i] = -1;
                stack.push(arr[i]);
            }
            else{
                int val = stack.peek();
                if(val > arr[i]){
                    nge[i] = val;
                    stack.push(arr[i]);
                }
                else{
                    while(!stack.isEmpty() && stack.peek()<=arr[i]){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        nge[i] = -1;
                    }
                    else{
                        nge[i] = stack.peek();
                    }
                    stack.push(arr[i]);
                }
            }
        }
        return nge;
    }

    public static int[] previousGreaterElement(int[] arr) {
        int[] pge = new int[arr.length];
         int n = arr.length;
        Arrays.fill(pge, -1);
        Stack<Integer> st = new Stack<>();

        // Implement PGE logic here
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                pge[i] = -1;
                st.push(arr[i]);
            }
            else{
                int val = st.peek();
                if(val >arr[i]){
                    pge[i] = val;
                    st.push(arr[i]);
                }
                else{
                    while(!st.isEmpty() && st.peek()<=arr[i]){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        pge[i] = -1;
                        st.push(arr[i]);
                    }
                    else{
                        pge[i] = st.peek();
                        st.push(arr[i]);
                    }
                }
                
            }
        }
        return pge;
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 8, 20, 15, 3, 12};
        
        int[] pse = previousSmallerElement(arr);
        int[] nse = nextSmallerElement(arr);
        int[] nge = nextGreaterElement(arr);
         int[] pge = previousGreaterElement(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Previous Smaller Element: " + Arrays.toString(pse));
        System.out.println("Next Smaller Element: " + Arrays.toString(nse));
        System.out.println("Next Greater Element: " + Arrays.toString(nge));
      System.out.println("Previous Greater Element: " + Arrays.toString(pge));
    }
}

