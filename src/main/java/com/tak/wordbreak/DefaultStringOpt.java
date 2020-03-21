package com.tak.wordbreak;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:55
 */
public class DefaultStringOpt extends AbstractStringOpt{

    private static DefaultStringOpt defaultStringOpt = new DefaultStringOpt();

    private DefaultStringOpt(){
        super();
    }

    public static DefaultStringOpt  getInstance(){
        return defaultStringOpt;
    }

    @Override
    public List<String> wordBreak(OptBase optBase){
        return wordBreak(optBase.getWord(),new ArrayList<>(),super.getDictionary());
    }

}