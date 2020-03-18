package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:46
 */
public abstract class AbstractStringOpt implements StringOpt {

    private String[] dictionary;

    public void wordBreak(String word,String[] theDictionary){
        List<String> dics= new ArrayList<String>();
        for (int i = 0; i < theDictionary.length; i++) {
            String[] dicWords=theDictionary[i].split(" ");
            for (int j = 0; j < dicWords.length; j++) {
                dics.add(dicWords[j]);
            }
        }
        wordBreak(word, new ArrayList<String>(),dics.toArray(new String[dics.size()]));
    }

    // 递归方法进行打印
    public void wordBreak(String s, List<String> al, String[] userDictionary){
        int len = s.length();
        if(len == 0){ // 退出递归条件，同时打印出来
            System.out.println(String.join(" ", al));
            return;
        }

        // 递归调用
        for(int i=1; i<=len; i++){
            String substr = s.substring(0, i);
            if(dictionaryContains(substr,userDictionary)){
                al.add(substr);
                wordBreak(s.substring(i), al,userDictionary);
                al.remove(al.size()-1);
            }
        }
    }

    public boolean dictionaryContains(String word,String[] dictionary){
        for(int i=0; i<dictionary.length; i++){
            if(dictionary[i].equals(word)){
                return true;
            }
        }
        if("and".equals(word)){
        	return true;
        }
        return false;
    }

    public String[] getDictionary() {
        return dictionary;
    }

    public void setDictionary(String[] dictionary) {
        this.dictionary = dictionary;
    }
}
