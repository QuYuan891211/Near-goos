package com.nmefc.neargoos.controller.document;
import com.nmefc.neargoos.entity.document.DocumentBaseEntity;
import com.nmefc.neargoos.service.inte.DocumentBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/documentbase")
public class DocumentBaseController {

    @Autowired
    private DocumentBaseService documentBaseService;

    @ResponseBody
    @GetMapping(value = "tab")
    public List<DocumentBaseEntity> getBaseByTab(Long id){
        List<DocumentBaseEntity> baseByTab = documentBaseService.getBaseByTab(id);
        return baseByTab;
    }
}
