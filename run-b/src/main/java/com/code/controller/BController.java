package com.code.controller;

import com.code.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {

    @Value("${module.name}")
    private String moduleName;

    @RequestMapping(value = "/")
    public String start(@RequestParam String text){
        // core-util 메소드 사용
        String decodeTxt = CommonUtils.decodeBase64(text);
        return CommonUtils.encodeBase64(decodeTxt+":"+moduleName);
    }
}
