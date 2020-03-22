package com.tak.wordbreak;

import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:09
 */
public class IncludeCustDicStringOpt<T extends OptBase> extends AbstractStringOpt<T>{

    private static IncludeCustDicStringOpt<OptIcludeCustDic> custDicStringOpt = new IncludeCustDicStringOpt<>();

    private IncludeCustDicStringOpt(){super();}

    public static IncludeCustDicStringOpt<OptIcludeCustDic> getInstance(){
        return custDicStringOpt;
    }

    @Override
    public List<String> wordBreak(T optBase){
        return super.wordBreak(optBase);
    }

}
