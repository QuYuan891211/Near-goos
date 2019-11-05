package com.nmefc.neargoos.controller.document;
import com.nmefc.neargoos.entity.document.DocumentImageEntity;
import com.nmefc.neargoos.service.inte.DocumentImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 20:56 2019/10/21
 */
@Controller
@RequestMapping("/image")
public class DocumentImageController {

    @Autowired
    private DocumentImageService documentImageService;

    @ResponseBody
    @GetMapping(value="bybase")
    public List<DocumentImageEntity> getImageByBase(Long id){

        List<DocumentImageEntity> imageByBase=documentImageService.getImageByBase(id);
        return imageByBase;
    }
}
