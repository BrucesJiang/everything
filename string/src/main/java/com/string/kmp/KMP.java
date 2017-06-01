package com.string.kmp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruce Jiang on 2017/6/1.
 */
public class KMP {
    /**
     * 预处理， 构建next表
     * @param pattern 模式串
     * @return 构建的next表
     */
    public static int[] makeNext(String pattern){
        int len = pattern.length();
        int[] next = new int[len+1];
        next[0] = next[1] = 0;
        int j = 0;
        for(int i=1; i < len; i++){
            while(j>0 && (pattern.charAt(j) != pattern.charAt(i))){
                j = next[j];
            }
            if(pattern.charAt(i) == pattern.charAt(j)){
                j++;
            }
            next[i+1] = j;
        }
        return next;
    }

    /**
     * 查找给定文本text中所有符合pattern的初始位置，返回其初始位置列表
     * @param text
     * @param pattern
     * @return
     */
    public static List<Integer> search(String text, String pattern){
        List<Integer> list = null;
        if(text == null || text.length() == 0 || pattern == null || pattern.length() == 0){
            return list;
        }
        list = new ArrayList<Integer>();
        int[] next = makeNext(pattern);
        int lenT = text.length();
        int lenP = pattern.length();
        int j  = 0;
        for(int i = 0; i < lenT; i++){
            while(j>0 && text.charAt(i) != pattern.charAt(j)){
                j = next[j+1];
            }
            if(pattern.charAt(j) == text.charAt(i)){
                j++;
            }
            if(j == lenP){
                list.add(i-j+1);
                j = next[j];
            }
        }
        return list;
    }
}
