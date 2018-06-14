package Interview_Notebook_GitHub;

/**
 * Created by zhangxuelong on 2018/6/14
 * 该算法内循环if语句执行N(N-1)(N-2)=N的3次幂，增长数量级为O(N的3次幂）
 */
public class ThreeSumSlow implements ThreeSum {
    public int count(int[] nums) {
        int N = nums.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; j < N; j++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}


