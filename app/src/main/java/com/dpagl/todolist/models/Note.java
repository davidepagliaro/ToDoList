package com.dpagl.todolist.models;

/**
 * Created by dpagl on 20/02/2017.
 */

public class Note {
    private String title;
    private String dataCreation;
    private String lastUpdate;
    private String body;
    private String endDate;
    private StateNote state;

    public Note(String title, String dataCreation, String lastUpdate, String body, String endDate) {
        this.title = title;
        this.dataCreation = dataCreation;
        this.lastUpdate = lastUpdate;
        this.body = body;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDataCreation() {
        return dataCreation;
    }

    public void setDataCreation(String dataCreation) {
        this.dataCreation = dataCreation;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
