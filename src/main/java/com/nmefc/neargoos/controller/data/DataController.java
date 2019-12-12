package com.nmefc.neargoos.controller.data;

import com.nmefc.neargoos.common.utils.DateTimeUtils;
import com.nmefc.neargoos.entity.data.*;
import com.nmefc.neargoos.middleModel.DataInfoQueryModel;
import com.nmefc.neargoos.middleModel.DataInfoStatisticsModel;
import com.nmefc.neargoos.service.inte.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@Description: data介绍功能的控制器
 *@Param:
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/10 9:48
 */
//@RestController
@CrossOrigin(origins = "*",allowedHeaders ="*" )
@Controller
////实现跨域注解
////origin="*"代表所有域名都可访问
////maxAge飞行前响应的缓存持续时间的最大年龄，简单来说就是Cookie的有效期 单位为秒
////若maxAge是负数,则代表为临时Cookie,不会被持久化,Cookie信息保存在浏览器内存中,浏览器关闭Cookie就消失
//@CrossOrigin(origins = "http://localhost:8081",maxAge = 3600)
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
    @Autowired
    private DataRecordService dataRecordService;
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
    public Page<DataOverviewEntity> getAllOverview(){
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
    @PostMapping("/getCategoryByBaseCondition")
    public Page<DataCategoryEntity> getCategoryByBaseCondition(Long id,String name,Integer page,Integer size){
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
        public Page<DataSourceEntity> getSourceByBaseCondition(Long id, String name, Integer page, Integer size){
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
    public Page<DataAreaEntity> getAreaByBaseCondition(Long id, String name, Integer page, Integer size){
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
    @PostMapping("/getDataInfoByQuery")
    public List<DataDataInfoEntity> getDataInfoByQuery(DataInfoQueryModel dataInfoQueryModel){
        //        int page=0,size=10;
        //        1. 检查是否传入分页数据
        if (dataInfoQueryModel == null){return null;}
        if (dataInfoQueryModel.getPage() == null || dataInfoQueryModel.getSize() == null){return null;}

        return dataInfoService.findByBaseCondition(dataInfoQueryModel);
    }
    /**
     *@Description: 根据数据ID获取数据下载记录
     * [to-do] 分页
     *@Param: [id]
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataRecordEntity>
     *@Author: quyua
     *@Date: 2019/10/24 0:52
     */
    @ResponseBody
    @GetMapping("/getDataRecordByDatainfoId")
    public List<DataRecordEntity> getDataRecordByDatainfoId(Long id){
        if (id == null){return null;}
        return dataInfoService.findDataRecordByDataInfoId(id);
    }

    /**
     *@Description: 根据数据下载记录ID获取数据信息
     * [to-do]分页
     *@Param: [id]
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataDataInfoEntity>
     *@Author: quyua
     *@Date: 2019/10/24 1:36
     */
    @ResponseBody
    @GetMapping("/getDataInfoByDataRecordId")
    public List<DataDataInfoEntity> getDataInfoByDataRecordId(Long id){
        if (id == null){return null;}
        return dataRecordService.findDataInfoByDataRecordId(id);
    }
    /**
     *@Description: 各类别数据统计信息
     *@Param: [name]
     *@Return: java.util.List<com.nmefc.neargoos.middleModel.DataInfoStatisticsModel>
     *@Author: quyua
     *@Date: 2019/12/11 15:36
     */
    @ResponseBody
    @GetMapping("/statistics")
    public List<DataInfoStatisticsModel> getDataInfoStatistics(){

//        //1.得到类别id
        //暂时写死
        List<DataCategoryEntity> dataCategoryEntityList =  this.getCategoryByBaseCondition(null,null,0,10).getContent();
        List<DataInfoStatisticsModel> resultList = new ArrayList<>();
        if(dataCategoryEntityList == null || dataCategoryEntityList.size()<1) {return null;}
        dataCategoryEntityList.forEach(item->{
            Long id = item.getId();
            DataInfoQueryModel dataInfoQueryModel = new DataInfoQueryModel();
            dataInfoQueryModel.setCategoryId(id);
            dataInfoQueryModel.setPage(0);
            dataInfoQueryModel.setSize(0);
            dataInfoQueryModel.setCategoryName(item.getName());
            resultList.add(dataInfoService.statisticsByCategory(dataInfoQueryModel));
        });

        return resultList;

    }
}
