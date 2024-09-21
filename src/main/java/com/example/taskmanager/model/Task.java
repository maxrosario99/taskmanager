package com.example.taskmanager.model;

import java.util.Date;

public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private Date createDate;
    private Date completedDate;

    public Task() {
        this.createDate = new Date();
    }

    public Task(Long id, String title, String description) {
        this();
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
        if (completed) {
            this.completedDate = new Date();
        } else {
            this.completedDate = null;
        }
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        if (this.createDate == null) {
            this.createDate = createDate;
        }
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }
}