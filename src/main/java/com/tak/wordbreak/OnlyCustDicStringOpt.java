package com.tak.wordbreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 1:16
 */
public class OnlyCustDicStringOpt extends  AbstractStringOpt{

    private static OnlyCustDicStringOpt onlyCustDicStringOpt = new OnlyCustDicStringOpt();

    private OnlyCustDicStringOpt(){
        super();
    }

    public static OnlyCustDicStringOpt getInstance(){
        return onlyCustDicStringOpt;
    }

    @Override
    public List<String> wordBreak(OptBase optBase){
        OptOnlyCustDic optOnlyCustDic = (OptOnlyCustDic) optBase;
        setMaxLen(0);
        Set<String> dics = new HashSet<>();
        dics.add("and");
        for(String word : optOnlyCustDic.getCustDic()) {
            String[] words = word.split(" ");
            for(String newWord : words){
                dics.add(newWord);
            }
            setMaxLen(Math.max(getMaxLen(), word.length()));
        }
        return wordBreak(optOnlyCustDic.getWord(),new ArrayList<>(),dics);
    }

}
