package com.nmefc.neargoos.controller.document;

import com.nmefc.neargoos.entity.document.DocumentContentEntity;
import com.nmefc.neargoos.service.inte.DocumentContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * \* Created with IntelliJ IDEA.
 * \* User: DELL
 * \* Date: 2019/10/22
 * \* Time: 16:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Controller
@RequestMapping("/content")
public class DocumentContentController {
    @Autowired
    private DocumentContentService documentContentService;

    @ResponseBody
    @GetMapping(value = "bybid")
    public List<DocumentContentEntity> getContentByBid(Long id) {
        List<DocumentContentEntity> list = documentContentService.getContentByBase(id);
        return list;
    }
}
