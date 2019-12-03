package com.example.demo.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DruidStatController {

    @GetMapping(value = "/druid/stat/")
    public Object drudiStat(){
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();

    }

}
