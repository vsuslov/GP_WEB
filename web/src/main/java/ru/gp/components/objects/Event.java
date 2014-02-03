package ru.gp.components.objects;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.11.13
 * Time: 16:56
 * To change this template use File | Settings | File Templates.
 */
public class Event {
    private Long id;
    private String title;
    private Date date;

    public Event(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
