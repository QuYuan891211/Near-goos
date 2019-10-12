package com.nmefc.neargoos.controller.data;

import com.nmefc.neargoos.common.enumPackage.ResponseMsg;
import com.nmefc.neargoos.common.utils.DateTimeUtils;
import com.nmefc.neargoos.entity.data.DataOverviewEntity;
import com.nmefc.neargoos.repository.inte.DataOverviewRepository;
import com.nmefc.neargoos.service.inte.DataOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
    private DataOverviewService dataOverviewService;
//    /**
//     *@Description: 新增
//     *@Param: [dataOverviewEntity]
//     *@Return: java.lang.String
//     *@Author: quyua
//     *@Date: 2019/10/10 9:54
//     */
//    @ResponseBody
//    @PostMapping("/insert")
//    public String insert(@RequestBody DataOverviewEntity dataOverviewEntity){
//
//        dataOverviewEntity.setGmtCreate(DateTimeUtils.date2timestamp(new Date()));
//        dataOverviewEntity.setGmtModified(DateTimeUtils.date2timestamp(new Date()));
//        dataOverviewRepository.save(dataOverviewEntity);
//        return ResponseMsg.SUCCESS.getValue();
//    }

    /**
     *@Description: 查找所有数据介绍（未软删除的）
     *@Param: []
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataOverviewEntity>
     *@Author: quyua
     *@Date: 2019/10/12 17:05
     */
    @ResponseBody
    @GetMapping("/findAll")
    public List<DataOverviewEntity> findAll(){
        DataOverviewEntity dataOverviewEntity = new DataOverviewEntity();
       return dataOverviewService.findDataNotDelete(dataOverviewEntity);
    }

}
