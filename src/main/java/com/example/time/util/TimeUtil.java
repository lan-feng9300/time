package com.example.time.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    public static String getStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = sdf.format(date);
        return str;
    }

    public static void main(String[] args) {

        System.out.println(getStr(new Date()));
    }
}

