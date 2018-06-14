package Sort;

import java.util.Arrays;

/**
 * Created by zhangxuelong on 2017/11/8
 */
public class QuickSort {
    public static int partition(long arr[],int left,int right,long point){
        int leftPtr = left -1;
        int rightPtr = right;
        while (true){
            //循环，将比关键字小的留在左端
            while (leftPtr < rightPtr&&arr[++leftPtr]<point);
            //循环，将比关键字打的留在右端
            while (rightPtr>leftPtr&&arr[--rightPtr]>point);
            if (leftPtr>=rightPtr){
                break;
            }else {
                long temp = arr[leftPtr];
                arr[leftPtr]=arr[rightPtr];
                arr[rightPtr] = temp;
            }
        }
        //将关键字和当前leftPtr所指的这一个进行交换
        long temp = arr[leftPtr];
        arr[leftPtr]=arr[right];
        arr[right]=temp;
        return leftPtr;
    }
    /*public static int partition(int[] arr, int start, int end) {
        int base = arr[end];
        int n = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < base) {
                if (i != n) {
                    exchange(arr, i, n);
                    n++;
                }
            }
            exchange(arr, n, end);
        }
        return n;
    }

    private static void exchange(int[] arr, int n, int end) {
        int temp = arr[n];
        arr[n] = arr[end];
        arr[end] = temp;
    }
    public static void recurPartion(int[] arr,int start,int end){
        if (end-start<1){
            return;
        }
        int part = partition(arr,start,end);
        if (part==start){
            recurPartion(arr,part+1,end);
        }else if (part==end){
            recurPartion(arr,start,end-1);
        }else {
            recurPartion(arr,start,part-1);
            recurPartion(arr,part+1,end);
        }
    }
    public static void main(String[] args){
        int[] arr = {8, 2, 1, 4,6,7, 3, 5, 9, 6,11,19,13,55,67,32,22};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        recurPartion(arr,0,arr.length-1);
    }
    // todo [5, 3, 7, 4, 6, 6, 9, 1, 11, 13, 2, 19, 8, 22, 32, 67, 55]上述功能不完善，没有实现排序。*/
}
