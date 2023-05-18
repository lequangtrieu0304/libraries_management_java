package com.libraries.BTL.ultis;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CompareDate {
    public int compare(String dateStr1, String dateStr2){
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");
        try {
            Date date1 = format.parse(dateStr1);
            Date date2 = format.parse(dateStr2);

            return date1.compareTo(date2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
