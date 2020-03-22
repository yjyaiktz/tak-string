package com.tak.wordbreak;

import java.util.Set;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:38
 */
public class OptIcludeCustDic extends OptBase {

    public OptIcludeCustDic(String word, Set<String> custDic){
        super(word,custDic,true);
    }
}
