package com.string.string_shift_included;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bruce Jiang on 2017/5/31.
 */
public class SSINTest {
    @Test
    public void stringShitIncluded() throws Exception {
        String target0 = "AABCD";
        String pattern0 = "CDAA";
        SSIN ssin = new SSIN(target0, pattern0);
        Assert.assertEquals(true,ssin.StringShitIncluded());
        String target1 = "ABCD";
        String pattern1 = "ACBD";
        ssin = new SSIN(target1, pattern1);
        Assert.assertEquals(false, ssin.StringShitIncluded());
    }
}