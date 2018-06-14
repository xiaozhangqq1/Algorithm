package Sort;

/**
 * Created by zhangxuelong on 2017/11/22
 */
public class SelectionSort {
    /**
     * 菜鸟教程上看到的
     */
    public static void select_sort(int array[],int length){
        for (int i = 0; i<length-1;i++){
            int minIndex = i;
            for (int j = i+1;j<length;j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                int temp = array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,1,2,5,7,4};
        //select_sort(arr,arr.length);
        select_sort1(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }

    /**
     * 自己写
     */
    private static void select_sort1(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
