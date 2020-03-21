package com.tak.wordbreak;

import java.util.Set;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:44
 */
public class OptOnlyCustDic extends OptBase{

    private Set<String> custDic;

    public OptOnlyCustDic(){}

    public OptOnlyCustDic(String word, Set<String> custDic){
        super(word);
        this.custDic = custDic;
    }

    public Set<String> getCustDic() {
        return custDic;
    }

    public void setCustDic(Set<String> custDic) {
        this.custDic = custDic;
    }

}
