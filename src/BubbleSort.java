/**
 * Created by zhangxuelong on 2017/11/22
 */
public class BubbleSort {
     static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 33, 11};
        //bubbleSort(arr);
        bubbleSort1(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    /**
     * 数据的顺序排好之后，冒泡算法仍然会继续进行下一轮的比较，直到arr.length-1次，后面的比较没有意义的。
     * 设置标志位flag，如果发生了交换flag设置为true；如果没有交换就设置为false。
       这样当一轮比较结束后如果flag仍为false，即：这一轮没有发生交换，说明数据的顺序已经排好，没有必要继续进行下去。
     */
     static void bubbleSort1(int[] arr) {
        int temp;
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}


