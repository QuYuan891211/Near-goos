//package com.nmefc.neargoos.dao.management;
//
//import com.nmefc.neargoos.common.enumPackage.Area;
//import com.nmefc.neargoos.common.enumPackage.ProductType;
//import com.nmefc.neargoos.entity.management.Product;
//import com.nmefc.neargoos.entity.management.ProductExample;
//
//import java.util.Date;
//import java.util.List;
//import org.apache.ibatis.annotations.Param;
//import org.joda.time.DateTime;
//
//public interface ProductMapper {
//    long countByExample(ProductExample example);
//
//    int deleteByExample(ProductExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Product record);
//
//    int insertSelective(Product record);
//
//    List<Product> selectByExample(ProductExample example);
//
//    Product selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);
//
//    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);
//
//    int updateByPrimaryKeySelective(Product record);
//
//    int updateByPrimaryKey(Product record);
//
//    /**
//     * @Author : evaseemefly
//     * @Description : 根据 产品类型，间隔，起始时间，以及区域获取对应的图片名称
//     * @params :
//     * @Date : 2019/10/5 11:40
//     * @return :
//     */
//    List<Product> selectByCondition(@Param("type") Integer type, @Param("interval")  Integer interval, @Param("area")  Integer area, @Param("targetDate") Date date);
////    List<Product> selectByCondition( Integer type, Integer interval, Integer area);
//
//
//}