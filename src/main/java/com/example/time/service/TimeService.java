package com.example.time.service;

import com.example.time.dao.TimeDao;
import com.example.time.domain.TimeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    @Autowired
    TimeDao timeDao;

    public String test(){

        try {
            System.out.println("我先睡一会觉先");
            //Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }

    public boolean addTime(TimeBean bean){
        int i = timeDao.addTimeBean(bean.getStartTime(), bean.getEndTime());
        if (i >0) {
            return true;
        }
        return false;
    }
}
