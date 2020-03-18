package com.test;

import java.util.List;

public interface StringOpt {

    boolean dictionaryContains(String word,String[] dictionary);

    void wordBreak(String s, List<String> al, String[] userDictionary);

    void takeWord(OptBase optBase);

    void wordBreak(String word,String[] theDictionary);

}
