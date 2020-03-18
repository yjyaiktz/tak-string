package com.test;

import sun.security.jca.GetInstance;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:55
 */
public class DefaultStringOpt extends AbstractStringOpt{

    private static DefaultStringOpt defaultStringOpt = new DefaultStringOpt();

    private DefaultStringOpt(){}

    public static DefaultStringOpt  getInstance(){
        return defaultStringOpt;
    }

    @Override
    public void takeWord(OptBase optBase){
        wordBreak(optBase.getWord(),super.getDictionary());
    }

}
