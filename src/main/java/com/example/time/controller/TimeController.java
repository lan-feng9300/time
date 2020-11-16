package com.example.time.controller;

import com.example.time.domain.TimeBean;
import com.example.time.service.TimeService;
import com.example.time.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeController {

    @Autowired
    TimeService timeService;

    @GetMapping("/test")
    public String test(){

        TimeBean timeBean = new TimeBean();
        timeBean.setStartTime(TimeUtil.getStr(new Date()));
        String test = timeService.test();
        timeBean.setEndTime(TimeUtil.getStr(new Date()));
        System.out.println(timeBean.getEndTime()+timeBean.getStartTime());
        boolean ret = timeService.addTime(timeBean);
        System.out.println(ret);
        return "ok";
    }
}
