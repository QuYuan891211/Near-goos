package com.nmefc.neargoos.middleModel;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author : evaseemefly
 * @Description : 产品搜索的中间mid model
 * @params :
 * @Date : 2019/12/8 16:04
 * @return :
 */
public class ProductSearchMidModel {
    private String cateogry;
    private String area;
    private String period;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @JsonFormat(timezone = "GTM+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date start;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @JsonFormat(timezone = "GTM+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date end;

//    public ProductSearchMidModel(String cateogry, String area, String period, Date start, Date end) {
//        this.cateogry = cateogry;
//        this.area = area;
//        this.period = period;
//        this.start = start;
//        this.end = end;
//    }

    public String getCateogry() {
        return cateogry;
    }

    public String getArea() {
        return area;
    }

    public String getPeriod() {
        return period;
    }

    public Date getStart() {
        return start;
    }

    //
    public Date getEnd() {
        return end;
    }

    public void setCateogry(String cateogry) {
        this.cateogry = cateogry;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    //    @JsonFormat(timezone = "GTM+8",pattern="yyyy-MM-dd HH:mm:ss")
    public void setStart(Date start) {
        this.start = start;
    }

    //
    public void setEnd(Date end) {
        this.end = end;
    }


}
