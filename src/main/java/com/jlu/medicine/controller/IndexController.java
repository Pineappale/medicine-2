package com.jlu.medicine.controller;

import com.jlu.medicine.entry.TPerson;
import com.jlu.medicine.service.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.jlu.medicine.controller
 * @ClassName: IndexController
 * @Description:
 * @author: 张大伟
 * @date: 2019/11/29 19:34
 **/

@Controller
public class IndexController {
    private static final String INDEX = "index";
    @Autowired
    private test tt;

    @RequestMapping(value = "/show55",produces = "text/plain;charset=UTF-8")
    public String getIndex() {

        return INDEX;
    }

    @ResponseBody
    @RequestMapping(value = "/show22")
    public Map<String,TPerson> getStringtest() {
        Map<String,TPerson> map=new HashMap<>();

        TPerson TP=tt.select(2);
        System.out.println("================"+TP);
        map.put("person",TP);
        System.out.println("================"+map.get("person").toString());
        return map;
    }
}




