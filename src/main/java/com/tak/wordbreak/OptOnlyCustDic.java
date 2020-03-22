package com.tak.wordbreak;

import java.util.Set;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:44
 */
public class OptOnlyCustDic extends OptBase{

    public OptOnlyCustDic(String word, Set<String> custDic){
        super(word,custDic,false);
    }

}
