package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:09
 */
public class CustDicStringOpt extends AbstractStringOpt{

    private static CustDicStringOpt custDicStringOpt = new CustDicStringOpt();

    public static CustDicStringOpt getInstance(){
        return custDicStringOpt;
    }

    public void takeWord(OptBase optBase){
        OptCustDic optCustDic = (OptCustDic) optBase;
        List<String> list = new ArrayList<String>(Arrays.asList(getDictionary()));
        list.addAll(Arrays.asList(optCustDic.getCustDic()));
        String[] newDictionary=list.toArray(new String[list.size()]);
        wordBreak(optCustDic.getWord(),newDictionary);
    }

}
