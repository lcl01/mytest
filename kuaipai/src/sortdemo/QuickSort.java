package sortdemo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,5,6,4,2,1,3,24,66};
        quickSort(arr,0,arr.length-1);
        System.out.println("快排结果:" + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left,int right) {
            if(left<right){
                dealPivot(arr, left, right);
                int pivot = right - 1;
                int i = left;
                int j = right - 1;
                while(true){
                    while (arr[++i] > arr[pivot]){

                    }
                    while (j > left && arr[--j] < arr[pivot]) {
                    }
                    if (i < j){
                        swap(arr,i,j);
                    }else{
                        break;
                    }
                }
                if (i < right) {
                    swap(arr, i, right - 1);
                }
                quickSort(arr,left,i-1);
                quickSort(arr,i+1,right);
            }
    }

    public static void dealPivot(int[] arr,int left,int right) {
        int mid = (left + right) / 2;
        if (arr[right] > arr[mid]) {
            swap(arr, left, mid);
        }
        if (arr[right] > arr[left]) {
            swap(arr, left, right);
        }
        if (arr[left] < arr[mid]) {
            swap(arr, right, mid);
        }
        swap(arr, right - 1, mid);
    }
    public static void swap(int[] arr,int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
