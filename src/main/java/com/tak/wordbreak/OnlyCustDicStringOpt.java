package com.tak.wordbreak;

import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:16
 */
public class OnlyCustDicStringOpt<T extends OptBase> extends  AbstractStringOpt<T>{

    private static OnlyCustDicStringOpt<OptOnlyCustDic> onlyCustDicStringOpt = new OnlyCustDicStringOpt<>();

    private OnlyCustDicStringOpt(){
        super();
    }

    public static OnlyCustDicStringOpt<OptOnlyCustDic> getInstance(){
        return onlyCustDicStringOpt;
    }

    @Override
    public List<String> wordBreak(T optBase){
        return super.wordBreak(optBase);
    }

}
