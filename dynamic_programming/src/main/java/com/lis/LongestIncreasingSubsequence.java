package com.lis;

/**
 * User： Bruce Jiang
 * Date: 2017/6/2 17:59
 * Description: DP中的一个基本问题， 最长非降子序列
 *  一个序列有N个数: A[1] , A[2], ..., A[N], 求出最长非降子序列
 *   LIS; Longest Increasing Subsequence
 *   两个点; 状态+ 状态转移方程
 *   A[1], A[2], ...., A[i] ， 其中 i < N .该问题规模变小也就是一个同质的子问题。
 *   假设d(i) = j : 表示前i个数中以A[i]为结尾的子序列最长非降子序列的长度为 j 。
 *   例如：
 *      5, 3, 4, 8, 6, 7
 *    d(1) : 5之前没有元素， 因此 d(1) = 1
 *    d(2) : 3结尾， 3之前没有比其小的元素， 则 d(2) = 1
 *    d(3) : 4结尾， 4之前保持非减且<=4的序列只有 3, 则 d(4) = 2 = d(2) + 1
 *    d(4) : 8结尾： 8之前比其小的有3个数， 则 d(5) = max{d(1), d(2), d(3)}+1 = 3
 *    因此，我们可以得出递推式： d(i) = max{d(j)+1}+1, 其中 j < i, 并且 A[j] <= A[i]
 */
public class LongestIncreasingSubsequence {
    /**
     * 求可比较序列a的最长非减序列， 按序返回序列下标
     * @param a
     * @return
     */
    public static int[] lis(int[] a){
        int[] num = new int[a.length];
        for(int i = 1; i < a.length; i++){
            num[i] = 1;
            for(int j = 0; j < i; j++){
                if(a[j] <= a[i]){
                    num[i] = Math.max(num[i], num[j]+1);
                }
            }
        }
        return num;
    }
}
