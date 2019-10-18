package com.nmefc.neargoos.controller.document;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import com.nmefc.neargoos.service.inte.DocumentTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
* @Author : evaseemefly
* @Description : 
* @Date : 2019/10/13 9:09 下午
*/
@Controller
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    private DocumentTabService documentTabService;
    
    /**
    * @Author : evaseemefly
    * @Description : 获取 1级 tab list
    * @params :
    * @Date : 2019/10/13 9:10 下午 
    * @return : 
    */
    @ResponseBody
    @GetMapping(value = "primary")
    public List<DocumentTabEntity> getListByPrimary(){
        List<DocumentTabEntity> list=documentTabService.getPrimaryTab();
        return list;
    }



}
