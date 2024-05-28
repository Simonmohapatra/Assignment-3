/*
Given an unsorted array, A, of integers and an integer k, write recursive program using Java 
for rearranging the elements in A so that all elements less than or equal to k come before any elements larger than k.
*/

public class HQ7 {
    public static void rearrange(int[] A, int k, int start, int end) {
        if (start >= end) {
            return;
        }
        if (A[start] > k && A[end] <= k) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
        }
        if (A[start] <= k) {
            rearrange(A, k, start + 1, end);
        }
        if (A[end] > k) {
            rearrange(A, k, start, end - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 5, 1, 6, 4};
        int k = 5;
        rearrange(array, k, 0, array.length - 1);
        System.out.println("Rearranged array:");
        for (int i=0;i< array.length;i++) {
            System.out.print(i + " ");
        }
    }
}
