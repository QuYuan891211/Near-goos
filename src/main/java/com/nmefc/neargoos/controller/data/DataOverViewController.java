package com.nmefc.neargoos.controller.data;

import com.nmefc.neargoos.common.enumPackage.ResponseMsg;
import com.nmefc.neargoos.common.utils.DateTimeUtils;
import com.nmefc.neargoos.entity.data.DataOverviewEntity;
import com.nmefc.neargoos.repository.inte.DataOverviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 *@Description: data介绍功能的控制器
 *@Param:
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/10 9:48
 */
@Controller
@RequestMapping("/data")
public class DataOverViewController {
    @Autowired
    private DataOverviewRepository dataOverviewRepository;
    /**
     *@Description: 新增
     *@Param: [dataOverviewEntity]
     *@Return: java.lang.String
     *@Author: quyua
     *@Date: 2019/10/10 9:54
     */
    @ResponseBody
    @PostMapping("/insert")
    public String insert(@RequestBody DataOverviewEntity dataOverviewEntity){

        dataOverviewEntity.setGmtCreate(DateTimeUtils.date2timestamp(new Date()));
        dataOverviewEntity.setGmtModified(DateTimeUtils.date2timestamp(new Date()));
        dataOverviewRepository.save(dataOverviewEntity);
        return ResponseMsg.SUCCESS.getValue();
    }
}
