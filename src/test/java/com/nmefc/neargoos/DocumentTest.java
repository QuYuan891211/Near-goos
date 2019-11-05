package com.nmefc.neargoos;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import com.nmefc.neargoos.repository.DocumentTabRepository;
//import com.sun.jmx.snmp.Timestamp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocumentTest {
    @Resource
    private DocumentTabRepository documentTabRepository;

    @Test
    public void testInsertData(){
        DocumentTabEntity documentTemp=new DocumentTabEntity();
        Timestamp tsNow=new Timestamp(System.currentTimeMillis());
        documentTemp.setGmtCreate(tsNow);
        documentTemp.setGmtModified(tsNow);
//        documentTemp.setLevel(1);
        documentTemp.setName("测试");
//        documentTabRepository.save(documentTemp);

    }
}
