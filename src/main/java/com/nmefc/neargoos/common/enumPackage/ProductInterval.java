package com.nmefc.neargoos.common.enumPackage;

import org.apache.shiro.crypto.hash.Hash;

import java.util.HashMap;
import java.util.Map;

/**
* @Author : evaseemefly
* @Description : 此类用来获取产品以及对应的时间list
* @params :
* @Date : 2019/10/7 10:47
* @return :
*/
public class ProductInterval {
    private Map<Integer,int[]> dictInterval;

    public ProductInterval(){
        this.dictInterval=new HashMap<Integer,int[]>();
        this.Init();
    }

    public Map<Integer,int[]> getDictInterval(){
        return dictInterval;
    }

    /**
    * @Author : evaseemefly
    * @Description : 对产品时间间隔map初始化
    * @params :
    * @Date : 2019/10/7 11:21
    * @return :
    */
    public void Init(){
        int[] shortArr=new int[4];
        int[] longArr=new int[24];
        for(int i=0;i<4;i++){
            shortArr[i]=(i+1)*24;
        }
        for (int i=0;i<24;i++){
            longArr[i]=i*3;
        }
        this.dictInterval.put(0,shortArr);
        this.dictInterval.put(1,longArr);
    }
}
