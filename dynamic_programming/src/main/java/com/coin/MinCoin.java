package com.coin;

/**
 * User： Bruce Jiang
 * Date: 2017/6/2 15:21
 * Description: 简单的DP问题解决 最少硬币数量问题
 *   问题描述：
 *     Given coins with values 1,3 and 5
 *     And the sum S is set to be 11
 *   问题分析以及解决方案：
 *      动态规划的核心： 状态以及状态转移方程。其中状态代表了用于描述该问题的子问题的解。
 *      我们定义 d(i) = j  表示凑成i元，需要的最少的硬币数量为j。
 *      i = 0 , d(0) = 0  : 0元时，没有面值为0的硬币，因此其数量为 0
 *      i = 1, d(1) = 0 : 我们理所当然的直到仅仅需要1个1元硬币即可。更加充分的理解就是
 *        我们先取一个 0元硬币，在此基础上再取一个1元硬币，也就是  d(1) = d(1 - 1) + 1
 *      i = 2, d(2) = 2 : d(2) = d(2 - 1) +1 = d(1 -1 ) + 1 +1 = 2
 *      i = 3 , d(3) = 1 : 第一种可选方案： 每次取一枚面值为1的硬币  d(3-1) = d(2) + 1 = 3；
 *          一次性取面值为3的硬币， 则 d(3 - 3) = 1
 *      依此类推，我们可以发现如下规律： d(i) = min{ d(i - Vj) + 1} ， 其中 i表示需要凑成的金额， Vj表示提供面值序列中
 *      的某一个， min{} 表示能够凑成i元的所有硬币组合所需硬币数最小的一个。
 *      Set Min[Sum] equal to Infinity for all of i
 *      Min[0] <- 0
 *      LEN = V.length
 *      for i <- 1 to Sum
 *          for j <- 1 to LEN
 *              If V[j] <= i AND Min[i - V[j]] + 1 < Min[i] then
 *                  Min[i] =  Min[i - V[j]] + 1
 *       return Min[sum]
 */
public class MinCoin {
    public static int getMinNum(int[] v, int sum){
        int[] min = new int[sum+1];
        for(int i = 0; i <= sum; i++){
            min[i] = Integer.MAX_VALUE;
        }
        min[0] = 0;
        for(int i = 1; i <= sum; i++){
            for(int j = 0; j < v.length; j++){
                if( v[j] <= i && (min[i - v[j]] + 1 ) < min[i]){
                    min[i] = min[i - v[j]] + 1;
                }
            }
        }
        return min[sum];
    }
}
