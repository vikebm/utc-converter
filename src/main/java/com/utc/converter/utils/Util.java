package com.utc.converter.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Util {
    public static String getFormatTime(LocalTime time, String timezone) throws Exception {

        SimpleDateFormat orginalFormat = new SimpleDateFormat("HH:mm:ss");
        orginalFormat.setTimeZone(TimeZone.getTimeZone("GMT"+timezone));

        try {
            Date originalDate = orginalFormat.parse(time.toString());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(originalDate);
            SimpleDateFormat newFormat = new SimpleDateFormat("HH:mm:ss");
            newFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return newFormat.format(calendar.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        throw new Exception("No se logro realizar la conversion");

    }
}
