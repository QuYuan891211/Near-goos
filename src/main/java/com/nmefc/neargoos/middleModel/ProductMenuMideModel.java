package com.nmefc.neargoos.middleModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: evase
 * \* Date: 2019/12/4
 * \* Time: 19:15
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductMenuMideModel {
    private String key;
    private String val;
    private String remark;
    private List<ProductAreaMenuMidModel> children;

    public ProductMenuMideModel(String key, String val, String remark, List<ProductAreaMenuMidModel> children) {
        this.key = key;
        this.val = val;
        this.remark = remark;
        this.children = children;
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

    public void setChildren(List<ProductAreaMenuMidModel> list) {
        this.children = list;
    }
}


