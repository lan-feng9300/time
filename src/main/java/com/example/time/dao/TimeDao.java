package com.example.time.dao;

import com.example.time.domain.TimeBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeDao {

    @Insert("INSERT INTO `t_time`(start_time,end_time) VALUES (#{startTime},#{endTime})")
    int addTimeBean(String startTime, String endTime);
}
