package com.nmefc.neargoos.middleModel;

public class BaseMidModel {
    private String val;
    private Integer key;

    public Integer getKey(){
        return key;
    }

    public String getVal(){
        return val;
    }


    public BaseMidModel(String val, Integer key){
        this.val=val;
        this.key=key;
    }

    public void setKey(Integer key){
        this.key=key;
    }
    public void setVal(String val){
        this.val=val;
    }
}
