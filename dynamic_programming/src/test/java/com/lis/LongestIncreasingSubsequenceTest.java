package com.lis;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * User： Bruce Jiang
 * Date: 2017/6/2 20:11
 * Description:
 */
public class LongestIncreasingSubsequenceTest {
    @Test
    public void lis() throws Exception {
        int[] a = {5,3,4,8,6,7};
        int[] num = LongestIncreasingSubsequence.lis(a);
        for(int i=0; i < num.length; i++){
            System.out.printf("%d\t", num[i]);
        }
    }

}