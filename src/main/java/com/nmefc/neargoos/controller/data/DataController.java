package com.nmefc.neargoos.controller.data;

import com.nmefc.neargoos.common.utils.DateTimeUtils;
import com.nmefc.neargoos.entity.data.*;
import com.nmefc.neargoos.middleModel.DataInfoQueryModel;
import com.nmefc.neargoos.service.inte.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
public class DataController {
    @Autowired
    private DataOverviewService dataOverviewService;
    @Autowired
    private DataCategoryService dataCategoryService;
    @Autowired
    private DataSourceService dataSourceService;
    @Autowired
    private DataAreaService dataAreaService;
    @Autowired
    private DataInfoService dataInfoService;
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
    @GetMapping("/getAllOverview")
    public Page<DataOverviewEntity> getOverview(){
        DataOverviewEntity dataOverviewEntity = new DataOverviewEntity();
        int page=0,size=5;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
       return dataOverviewService.findByBaseCondition(dataOverviewEntity,pageable);
    }
    /**
     *@Description:查找数据类型（未软删除的）
     *@Param: []
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataCategoryEntity>
     *@Author: quyua
     *@Date: 2019/10/20 0:21
     */
    @ResponseBody
    @GetMapping("/getCategoryByCondition")
    public Page<DataCategoryEntity> getCategoryByCondition(Long id,String name,Integer page,Integer size){
        DataCategoryEntity dataCategoryEntity = new DataCategoryEntity();
        dataCategoryEntity.setId(id);
        dataCategoryEntity.setName(name);
//        int page=0,size=10;
//        1. 检查是否传入分页数据
        if (page == null || size == null){return null;}
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        return dataCategoryService.findByBaseCondition(dataCategoryEntity,pageable);
    }

        /**
         *@Description:查找数据源（未软删除的）
         *@Param: []
         *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataCategoryEntity>
         *@Author: quyua
         *@Date: 2019/10/20 0:21
         */
        @ResponseBody
        @GetMapping("/getSourceByBaseCondition")
        public Page<DataSourceEntity> getSource(Long id, String name, Integer page, Integer size){
            DataSourceEntity dataSourceEntity = new DataSourceEntity();
            dataSourceEntity.setId(id);
            dataSourceEntity.setName(name);
    //        int page=0,size=10;
            //        1. 检查是否传入分页数据
            if (page == null || size == null){return null;}
            Sort sort = new Sort(Sort.Direction.DESC, "id");
            Pageable pageable = PageRequest.of(page, size, sort);
            return dataSourceService.findByBaseCondition(dataSourceEntity,pageable);
        }

    /**
     *@Description:查找海区信息（未软删除的）
     *@Param: []
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataCategoryEntity>
     *@Author: quyua
     *@Date: 2019/10/20 0:21
     */
    @ResponseBody
    @GetMapping("/getAreaByBaseCondition")
    public Page<DataAreaEntity> getArea(Long id, String name, Integer page, Integer size){
        DataAreaEntity dataAreaEntity = new DataAreaEntity();
        dataAreaEntity.setId(id);
        dataAreaEntity.setName(name);
        //        int page=0,size=10;
        //        1. 检查是否传入分页数据
        if (page == null || size == null){return null;}
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        return dataAreaService.findByBaseCondition(dataAreaEntity,pageable);
    }

    /**
     *@Description:查找数据信息（未软删除的）
     *@Param: []
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataCategoryEntity>
     *@Author: quyua
     *@Date: 2019/10/20 0:21
     */
    @ResponseBody
    @PostMapping("/getDataInfoByBaseCondition")
    public Page<DataDataInfoEntity> getDataInfo(DataInfoQueryModel dataInfoQueryModel){
        //        int page=0,size=10;
        //        1. 检查是否传入分页数据
        if (dataInfoQueryModel == null){return null;}
        if (dataInfoQueryModel.getPage() == null || dataInfoQueryModel.getSize() == null){return null;}
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(dataInfoQueryModel.getPage(), dataInfoQueryModel.getSize(), sort);
        return dataInfoService.findByBaseCondition(dataInfoQueryModel,pageable);
    }
}
