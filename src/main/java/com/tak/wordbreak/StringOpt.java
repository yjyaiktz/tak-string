package com.tak.wordbreak;

import java.util.List;
import java.util.Set;

public interface StringOpt {

    List<String> wordBreak(String s, List<String> al, Set<String> userDictionary);

    List<String> wordBreak(OptBase optBase);

    List<String> wordBreak(String word,Set<String> theDictionary);

}
