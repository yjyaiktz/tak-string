package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:16
 */
public class OnlyCustDicStringOpt extends  AbstractStringOpt{

    private static OnlyCustDicStringOpt onlyCustDicStringOpt = new OnlyCustDicStringOpt();

    private OnlyCustDicStringOpt(){}

    public static OnlyCustDicStringOpt getInstance(){
        return onlyCustDicStringOpt;
    }

    public void takeWord(OptBase optBase){
        OptOnlyCustDic optOnlyCustDic = (OptOnlyCustDic) optBase;
        wordBreak(optOnlyCustDic.getWord(),optOnlyCustDic.getCustDic());
    }

}
