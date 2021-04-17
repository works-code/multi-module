package com.code.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;

@Component
public class CommonUtils {

    public static String encodeBase64(String txt){
        String result = "";
        if(!StringUtils.isEmpty(txt)){
            result = Base64Utils.encodeToString(txt.getBytes());
        }
        return result;
    }

    public static String decodeBase64(String txt){
        String result = "";
        if(!StringUtils.isEmpty(txt)){
            result = new String(Base64Utils.decodeFromString(txt));
        }
        return result;
    }
}
