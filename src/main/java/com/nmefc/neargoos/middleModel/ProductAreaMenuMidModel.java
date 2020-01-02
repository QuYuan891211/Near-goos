package com.nmefc.neargoos.middleModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: evase
 * \* Date: 2019/12/4
 * \* Time: 19:17
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductAreaMenuMidModel {
    private String key;
    private String val;
    private String remark;

    private List<String> periods;
    private List<String> periodsIndex;

    public ProductAreaMenuMidModel(String key, String val, String remark, List<String> periods, List<String> periodsIndex) {
        this.key = key;
        this.val = val;
        this.remark = remark;
        this.periods = periods;
        this.periodsIndex = periodsIndex;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setPeriods(List<String> periods) {
        this.periods = periods;
    }

    public void setPeriodsIndex(List<String> periodsIndex) {
        this.periodsIndex = periodsIndex;
    }
}
