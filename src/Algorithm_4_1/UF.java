package Algorithm_4_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by zhangxuelong on 2018/6/11
 * union-find算法
 */
public class UF {
    // 分量id(以触电作为索引)
    private int[] id;
    // 分量数量
    private int count;

    public UF(int N) {
        // 初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return 0;
    }

    public void union(int p, int q) {

    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
        }
    }

}
