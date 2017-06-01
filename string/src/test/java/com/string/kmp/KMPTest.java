package com.string.kmp;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * User： Bruce Jiang
 * Date: 2017/6/1 16:58
 * Description:
 */
public class KMPTest {
    String pattern = "ababcaba";
    String text= "ddafdfababcabaafdfsababcaba";
    @Test
    public void makeNext() throws Exception {
        int[] next = KMP.makeNext(pattern);
        for(int i = 1; i < next.length; i++){
            System.out.printf("%d\t", next[i]);
        }
    }

    @Test
    public void search() throws Exception {
        List<Integer> list =  KMP.search(text, pattern);
        Iterator<Integer> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.printf("%d\t", iter.next());
        }
    }

}