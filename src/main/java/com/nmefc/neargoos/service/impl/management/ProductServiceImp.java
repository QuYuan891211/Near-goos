package com.nmefc.neargoos.service.impl.management;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductInterval;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.management.Product;
import com.nmefc.neargoos.entity.management.ProductExample;
import com.nmefc.neargoos.middleModel.AreaMidModel;
import com.nmefc.neargoos.middleModel.ProductTypeMidModel;
import com.nmefc.neargoos.service.impl.BaseServiceImp;
import com.nmefc.neargoos.service.management.ProductService;
//import com.nmefc.neargoos.service.management.ProductService;
import com.nmefc.neargoos.dao.management.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author : evaseemefly
 * @Description :
 * @params :
 * @Date : 2019/10/5 15:15
 * @return :
 */
@Service("productService")
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 根据 产品类型，间隔，起始时间，以及区域获取对应的图片名称
     * @params :
     * @Date : 2019/10/5 15:15
     */
    public List<Product> getMatchConditionImageList(ProductType type, Integer interval, Date targetDate, Area area) {
//        Product temp = new Product();
//        temp.setType(type.ordinal());
//        temp.setArea(area.ordinal());
//        temp.setTargetDate(targetDate);
//        temp.setInterval(interval);
        return productMapper.selectByCondition(type.ordinal(), interval, area.ordinal(), targetDate);
    }

    /**
     * @return :
     * @Author : evaseemefly
     * @Description :  获取产品对应的种类
     * @params :
     * @Date : 2019/10/7 10:21
     */
    public List<ProductTypeMidModel> getProductTypes() {
        List<ProductTypeMidModel> list = new ArrayList();
        for (ProductType temp : ProductType.values()) {
//            System.out.print(temp.toString());
//            System.out.print(temp.ordinal());
            String msg = String.format("枚举val:%s,对应index:%d %n", temp.toString(), temp.ordinal());
            System.out.printf(msg);
            list.add(new ProductTypeMidModel(temp.toString(), temp.ordinal()));
        }
        return list;
    }

    public List<AreaMidModel> getArea() {
        ProductInterval temp = new ProductInterval();
        Map<Integer, int[]> dictInterval = temp.getDictInterval();
//        for (Map.Entry<Integer,int[]> entry:dictInterval.entrySet()
//             ) {
//            entry.getKey();
//            entry.getValue();
//        }
        List<AreaMidModel> listArea=new ArrayList();
        // 循环area的枚举
        for (Area area : Area.values()) {
            String msg = String.format("枚举val:%s,对应index:%d %n", area.toString(), area.ordinal());
            System.out.printf(msg);
            // 深远海的是间隔3小时的
            if(area==Area.FarEast){
                listArea.add(new AreaMidModel(area.toString(),area.ordinal(),dictInterval.get(1)));
            }
            else{
                listArea.add(new AreaMidModel(area.toString(),area.ordinal(),dictInterval.get(0)));
            }

        }
        return listArea;


    }
}
