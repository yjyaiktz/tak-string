package com.tak.wordbreak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OptBase {

    private Set<String> custDic;

    private String word;

    private int maxLen;

    public OptBase(String word){
        this(word,new HashSet<>(1));
    }

    public OptBase(String word,Set<String> custDic){
        this.word = word;
        this.custDic = custDic;
        maxLen = 0;
        if(Objects.nonNull(custDic) && custDic.size() > 0){
            for(String w : custDic){
                maxLen = Math.max(maxLen, w.length());
            }
        }
    }

    public int getMaxLenWordOfDics(StringOptImpl abstractStringOpt){
        return Math.max(maxLen, abstractStringOpt.getMaxLen());
    }

    public Set<String> getDictionarys(StringOptImpl abstractStringOpt){
        Set<String> tempDictionary = new HashSet<>();
        tempDictionary.add("and");
        if(Objects.nonNull(custDic) && custDic.size() > 0){
            custDic.stream().forEach(s -> {
                String[] words = s.split(" ");
                tempDictionary.addAll(Arrays.asList(words));
            });
        }
        tempDictionary.addAll(abstractStringOpt.getDictionary());

        return tempDictionary;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Set<String> getCustDic() {
        return custDic;
    }

    public void setCustDic(Set<String> custDic) {
        this.custDic = custDic;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(int maxLen) {
        this.maxLen = maxLen;
    }
}
