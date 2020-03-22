package com.tak.wordbreak;

import java.util.*;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:46
 */
public abstract class AbstractStringOpt<T extends OptBase> implements StringOpt<T> {

    /**
     * set of dictionary
     */
    private Set<String> dictionary;

    /**
     * cache length of the longest words in dictionary
     */
    private int maxLen;

    public AbstractStringOpt(){
        maxLen = 0;
        dictionary = new HashSet<>();
        List<String> list = Arrays.asList(new String[]{"i", "or" , "and" ,"like", "sam", "sung", "samsung", "mobile", "ice", "cream","man", "go"});
        dictionary.addAll(list);
        for(String word : list) {
            maxLen = Math.max(maxLen, word.length());
        }
    }

    @Override
    public List<String> wordBreak(T optBase){
        Set<String> tempDictionary = new HashSet<>();
        tempDictionary.add("and");
        int maxCustLen = optBase.getMaxLen();
        if(Objects.nonNull(optBase.getCustDic()) && optBase.getCustDic().size() > 0){
            optBase.getCustDic().stream().forEach(s -> {
                String[] words = s.split(" ");
                tempDictionary.addAll(Arrays.asList(words));
            });
        }
        if(optBase.isAppendCustDic()) {
            tempDictionary.addAll(dictionary);
            maxCustLen = Math.max(maxLen, maxCustLen);
        }
        return wordBreak(optBase.getWord(),maxCustLen, new ArrayList<>(), tempDictionary);
    }

    /**
     * get the set of all possible ways to break the sentence in individual dictionary words
     */
    public List<String> wordBreak(String sentence, int maxLen,List<String> words, Set<String> userDictionary){
        List<String> result = new ArrayList<>();
        // shorten traversal
        int len = Math.min(sentence.length(),maxLen);
        /**
         * out trace of recursive condition
         * save the valid sentence and return;
         */
        if(sentence.length() == 0){
            result.add(String.join(" ", words));
            return result;
        }
        int i=0;
        while(++i<=len){
            String substr = sentence.substring(0, i);
            if(userDictionary.contains(substr)){
                words.add(substr);
                // recursive
                List<String> r2 = wordBreak(sentence.substring(i), len, words,userDictionary);
                if(r2.size() > 0) {
                    result.addAll(r2);
                }
                words.remove(words.size()-1);
            }
        }
        return result;
    }

    public Set<String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(int maxLen) {
        this.maxLen = maxLen;
    }
}
