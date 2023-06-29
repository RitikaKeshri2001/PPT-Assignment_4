import java.util.*;

public class Q1_IntersectionOf3SortedArray {
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length) {
            if(arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};

        List<Integer> result = arraysIntersection(arr1, arr2, arr3);
        for(int i:result) {
            System.out.print(i +" ");
        }
    }
}
