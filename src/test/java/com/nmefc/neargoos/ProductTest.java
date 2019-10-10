package com.nmefc.neargoos;

import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.repository.ProductRepository;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:19 2019/10/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    @Resource
    private ProductRepository productRepository;

    public void testFindAll(){

        List<ProductInfoEntity> list= productRepository.findAll();
    }
}
