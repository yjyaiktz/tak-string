package com.tak.wordbreak;

import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:09
 */
public class CustDicStringOpt extends AbstractStringOpt{

    private static CustDicStringOpt custDicStringOpt = new CustDicStringOpt();

    private CustDicStringOpt(){super();}

    public static CustDicStringOpt getInstance(){
        return custDicStringOpt;
    }

    @Override
    public List<String> wordBreak(OptBase optBase){
        OptCustDic optCustDic = (OptCustDic) optBase;
        return wordBreak(optCustDic.getWord(),optCustDic.getCustDic());
    }

}
