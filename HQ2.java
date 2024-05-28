//Write a recursive method in Java to search an element of an array using binary search.

public class HQ2 {
    public static int binarySearch(int[] arr, int x, int l, int h) {
        if (l > h) {
            return -1;
        }
        int mid = l + (h - l) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return binarySearch(arr, x, mid + 1, h);
        } else {
            return binarySearch(arr, x, l, mid - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 20;
        int index = binarySearch(arr, target, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
