package com.utc.converter.models;

import com.utc.converter.utils.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UTCTime {

    private LocalTime time;

    private String timezone;

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public UTCResponse getResponse() {

        try {
            return new UTCResponse(Util.getFormatTime(time, timezone));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private class UTCResponse {
        private String time;
        private static final String timezone = "utc";

        public UTCResponse(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTimezone() {
            return timezone;
        }
    }

}
