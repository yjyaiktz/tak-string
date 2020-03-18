package com.test;

import org.junit.Test;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:21
 */
public class TestStringOpt {

    @Test
    public void test(){
        // Stage 1
        DefaultStringOpt s1=DefaultStringOpt.getInstance();
        s1.setDictionary(new String[]{ "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream","man go"});
        s1.takeWord(new OptBase("ilikesamsung"));

        //Stage 2
        OnlyCustDicStringOpt s2=OnlyCustDicStringOpt.getInstance();
        s2.setDictionary(new String[]{ "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream","man go"});
        s2.takeWord(new OptOnlyCustDic("ilikeicecreamandmango",new String[]{"i", "like", "sam", "sung", "mobile", "icecream", "man go", "mango"}));

        //Stage 3
        CustDicStringOpt s3=CustDicStringOpt.getInstance();
        s3.setDictionary(new String[]{ "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream","man go"});
        s3.takeWord(new OptCustDic("ilikeicecreamandmangoOK",new String[]{"OK"}));

    }

}
