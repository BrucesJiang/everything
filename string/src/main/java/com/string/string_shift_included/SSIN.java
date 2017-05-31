package com.string.string_shift_included;

/**
 * Created by Bruce Jiang on 2017/5/31.
 *
 */
public class SSIN {
    private static final int MAX_LEN = 10000;
    private String target;
    private String pattern;

    public SSIN(String target, String pattern){
        this.pattern = pattern;
        this.target = target + target;
    }


    /**
     * 字符串移位包含问题
     *
     * @return
     */
    public boolean StringShitIncluded(){
        return target.indexOf(pattern) != -1;
    }
}
