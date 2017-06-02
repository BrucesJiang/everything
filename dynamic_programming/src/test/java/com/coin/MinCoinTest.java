package com.coin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * User： Bruce Jiang
 * Date: 2017/6/2 16:01
 * Description: 测试类
 */
public class MinCoinTest {
    @Test
    public void getMinNum() throws Exception {
        int[] v = {1,3,5};
        int sum = 11;
        Assert.assertEquals(3,MinCoin.getMinNum(v, 11));
    }

}