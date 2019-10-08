package com.nmefc.neargoos.middleModel;

import java.util.List;

public class ProductTypeMidModel {
    private String val;
    private Integer key;
//    private List<Integer> listInterval;

    public Integer getKey(){
        return key;
    }

    public String getVal(){
        return val;
    }

//    public List<Integer> getListInterval(){
//        return listInterval;
//    }

    public ProductTypeMidModel(String val, Integer key){
        this.val=val;
        this.key=key;
//        this.listInterval=list;
    }

    public void setKey(Integer key){
        this.key=key;
    }
    public void setVal(String val){
        this.val=val;
    }
}
