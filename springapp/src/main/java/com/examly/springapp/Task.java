package com.examly.springapp.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Task {
    @Id
    private int taskId;
    private String taskHolderName;
    private Date taskDate;
    private String taskName;
    private String taskStatus;
    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    public String getTaskHolderName() {
        return taskHolderName;
    }
    public void setTaskHolderName(String taskHolderName) {
        this.taskHolderName = taskHolderName;
    }
    public Date getTaskDate() {
        return taskDate;
    }
    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskStatus() {
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    @Override
    public String toString() {
        return "Task [taskDate=" + taskDate + ", taskHolderName=" + taskHolderName + ", taskId=" + taskId
                + ", taskName=" + taskName + ", taskStatus=" + taskStatus + "]";
    }
    
}
