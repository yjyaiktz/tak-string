package com.tak.wordbreak;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:55
 */
public class DefaultStringOpt<T extends OptBase> extends AbstractStringOpt<T>{

    private static DefaultStringOpt<OptBase> defaultStringOpt = new DefaultStringOpt<>();

    private DefaultStringOpt(){
        super();
    }

    public static DefaultStringOpt<OptBase> getInstance(){
        return defaultStringOpt;
    }

    @Override
    public List<String> wordBreak(T optBase){
        return super.wordBreak(optBase);
    }

}
