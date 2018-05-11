package com.launch.api;

import java.util.Date;

public class Event {
    private long id;
    private String name;
    private String description;
    private String location;
    private Date date;


    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long l) {
        this.id = l;
    }

    public void setDescription(String please_be_on_time) {
        this.description=please_be_on_time;

    }

    public void setLocation(String s) {
        this.location=s;

    }
}
