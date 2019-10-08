package com.nmefc.neargoos.middleModel;

public class AreaMidModel extends BaseMidModel {
    private int[] interval;

    public int[] getInterval(){
        return interval;
    }
    public AreaMidModel(String val, Integer key,int[] interval){
        super(val,key);
        this.interval=interval;
    }
}
