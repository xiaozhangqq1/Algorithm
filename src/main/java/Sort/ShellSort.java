package Sort;

/**
 * Created by zhangxuelong on 2017/11/27
 */
public class ShellSort {
    public static void shell_sort(int arr[], int length) {
        int temp = 0;
        int incre = length;
        while (true) {
            incre = incre / 2;
            for (int k = 0; k < incre; k++) {
                for (int i = k + incre; i < length; i += incre) {
                    for (int j = i; j > k; j -= incre) {
                        if (arr[j] < arr[j - incre]) {
                            temp = arr[j - incre];
                            arr[j - incre] = arr[j];
                            arr[j] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (incre == 1) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 33, 11};
        shell_sort(arr,arr.length);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
