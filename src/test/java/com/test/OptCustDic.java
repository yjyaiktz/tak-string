package com.test;

/**
 * @description
 * @Author 易建洋
 * @Date 2020/3/18 0:38
 */
public class OptCustDic extends OptBase {

    private String[] custDic;

    public OptCustDic(){}

    public OptCustDic(String word, String[] custDic){
        super(word);
        this.custDic = custDic;
    }

    public String[] getCustDic() {
        return custDic;
    }

    public void setCustDic(String[] custDic) {
        this.custDic = custDic;
    }
}
