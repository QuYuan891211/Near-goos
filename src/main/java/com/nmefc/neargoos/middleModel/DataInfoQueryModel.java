package com.nmefc.neargoos.middleModel;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;
/**
 *@Description: 数据信息查询中间实体
 *@Param:
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/22 3:22
 */
public class DataInfoQueryModel {
    private Long categoryId;
    private Long areaId;
    private Long sourceId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH")
    @JsonFormat(timezone = "GTM",pattern = "yyyy-MM-dd HH")
    private Date beginTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH")
    @JsonFormat(timezone = "GTM",pattern = "yyyy-MM-dd HH")
    private Date endTime;
    private Integer page;
    private Integer size;
    private String categoryName;
    private String sourceName;
    private String areaName;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
