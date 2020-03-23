package com.test;

import com.tak.wordbreak.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:21
 */
public class TestStringOpt {

    /**
     * Stage 1
     * Given a valid sentence without any spaces between the words and a dictionary of valid
     * English words, find all possible ways to break the sentence in individual dictionary words
     */
    @Test
    public void testStage1(){
        StringOpt<OptBase> s1 = StringOptImpl.getInstance();
        List<String> sentences = s1.wordBreak(new OptBase("ilikesamsungmobile"));
        Assert.assertEquals(2, sentences.size());
        Assert.assertEquals("i like sam sung mobile", sentences.get(0));
        Assert.assertEquals("i like samsung mobile", sentences.get(1));

        System.out.println("Input : \"ilikesamsungmobile\"");
        System.out.println("Output : " + sentences.get(0));
        System.out.println("         " + sentences.get(1));

        System.out.println("-----------------------------");

        sentences = s1.wordBreak(new OptBase("ilikeicecreamandmango"));
        Assert.assertEquals(1, sentences.size());
        Assert.assertEquals("i like ice cream and man go", sentences.get(0));
        System.out.println("Input : \"ilikeicecreamandmango\"");
        System.out.println("Output : " + sentences.get(0));
    }


    /**
     * Stage 2 - new requirement to be implemented:
     * If user provide a customized dictionary of valid English words as additional input, and the
     * program will only find in the user customized dictionary
     */
    @Test
    public void testStage2(){
        StringOpt<OptBase> s2 = StringOptImpl.getInstance();
        OptOnlyCustDic optBase = new OptOnlyCustDic("ilikeicecreamandmango",
                arrayToSet(new String[]{"i", "like", "sam", "sung", "mobile", "icecream", "man go", "mango"}));
        List<String> sentences = s2.wordBreak(optBase);
        Assert.assertEquals(2, sentences.size());
        Assert.assertEquals("i like icecream and man go", sentences.get(0));
        Assert.assertEquals("i like icecream and mango", sentences.get(1));

        System.out.println("Input : \"ilikeicecreamandmango\"");
        System.out.println("Output : " + sentences.get(0));
        System.out.println("         " + sentences.get(1));
    }


    /**
     * Stage 3 - new requirement to be implemented:
     * If user provide a customized dictionary of valid English words as additional input, and the
     * program will find all the valid words in the both dictionaries
     */
    @Test
    public void testStage3(){

        StringOpt<OptBase> s3 = StringOptImpl.getInstance();
        OptIcludeCustDic optBase = new OptIcludeCustDic("ilikeicecreamandmango",
                arrayToSet(new String[]{"i", "like", "sam", "sung", "mobile", "icecream", "man go", "mango"}));
        List<String> sentences = s3.wordBreak(optBase);
        Assert.assertEquals(4, sentences.size());
        Assert.assertEquals("i like ice cream and man go", sentences.get(0));
        Assert.assertEquals("i like ice cream and mango", sentences.get(1));
        Assert.assertEquals("i like icecream and man go", sentences.get(2));
        Assert.assertEquals("i like icecream and mango", sentences.get(3));
        System.out.println("Input : \"ilikeicecreamandmango\"");
        System.out.println("Output : " + sentences.get(0));
        System.out.println("         " + sentences.get(1));
        System.out.println("         " + sentences.get(2));
        System.out.println("         " + sentences.get(3));
    }

    public static Set<String> arrayToSet(String[] arrays){
        Set<String> dics = new HashSet<>();
        Arrays.asList(arrays).stream().forEach(s -> dics.add(s));
        return dics;
    }

}
