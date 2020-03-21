package com.tak.wordbreak;

import java.util.*;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:46
 */
public abstract class AbstractStringOpt implements StringOpt {

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
    public List<String> wordBreak(String word,Set<String> theDictionary){
        for (String word1 : theDictionary ){
            String[] dicWords=word1.split(" ");
            for (int j = 0; j < dicWords.length; j++) {
                dictionary.add(dicWords[j]);
                maxLen = Math.max(maxLen, dicWords[j].length());
            }
        }
        return wordBreak(word, new ArrayList<>(),dictionary);
    }

    /**
     * get the set of all possible ways to break the sentence in individual dictionary words
     */
    @Override
    public List<String> wordBreak(String sentence, List<String> al, Set<String> userDictionary){
        List<String> result = new ArrayList<>();
        // shorten traversal
        int len = Math.min(sentence.length(),maxLen);
        /**
         * out trace of recursive condition
         * save the valid sentence
         * return;
         */
        if(sentence.length() == 0){
            result.add(String.join(" ", al));
            return result;
        }
        int i=0;
        while(++i<=len){
            String substr = sentence.substring(0, i);
            if(userDictionary.contains(substr)){
                al.add(substr);
                // recursive
                List<String> r2 = wordBreak(sentence.substring(i), al,userDictionary);
                if(r2.size() > 0) {
                    result.addAll(r2);
                }
                al.remove(al.size()-1);
            }
        }
        return result;
    }

    public Set<String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Set<String>dictionary) {
        this.dictionary = dictionary;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(int maxLen) {
        this.maxLen = maxLen;
    }
}
