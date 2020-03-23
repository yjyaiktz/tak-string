package com.tak.wordbreak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:38
 */
public class OptIcludeCustDic extends OptBase {

    public OptIcludeCustDic(String word, Set<String> custDic){
        super(word,custDic);
    }

    @Override
    public int getMaxLenWordOfDics(StringOptImpl abstractStringOpt){
        return Math.max(getMaxLen(), abstractStringOpt.getMaxLen());
    }

    @Override
    public Set<String> getDictionarys(StringOptImpl abstractStringOpt) {
        Set<String> tempDictionary = new HashSet<>();
        tempDictionary.add("and");
        if (Objects.nonNull(super.getCustDic()) && super.getCustDic().size() > 0) {
            super.getCustDic().stream().forEach(s -> {
                String[] words = s.split(" ");
                tempDictionary.addAll(Arrays.asList(words));
            });
        }
        tempDictionary.addAll(abstractStringOpt.getDictionary());
        return tempDictionary;
    }
}
