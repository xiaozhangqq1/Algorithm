package Sort;

/**
 * Created by zhangxuelong on 2017/11/24
 */
public class InsertionSort {
    private static void insert_sort(int array[], int length){
        int temp;
        for (int i = 0;i<length-1;i++){
            for (int j = i+1;j>0;j--){
                if (array[j]<array[j-1]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,4,2};
        insert_sort(arr,arr.length);
        for (int i :arr){
            System.out.println(i);
        }
    }
}
