package com.tak.wordbreak;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OptBase {

    private boolean appendCustDic;

    private Set<String> custDic;

    private String word;

    private int maxLen;

    public OptBase(String word){
        this(word,new HashSet<>(),true);
    }

    public OptBase(String word,Set<String> custDic,boolean appendCustDic){
        this.word = word;
        this.custDic = custDic;
        this.appendCustDic = appendCustDic;
        maxLen = 0;
        if(Objects.nonNull(custDic) && custDic.size() > 0){
            for(String w : custDic){
                maxLen = Math.max(maxLen, w.length());
            }
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isAppendCustDic() {
        return appendCustDic;
    }

    public void setAppendCustDic(boolean appendCustDic) {
        this.appendCustDic = appendCustDic;
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
