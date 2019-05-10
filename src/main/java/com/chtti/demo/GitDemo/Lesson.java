package com.chtti.demo.GitDemo;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String courseName;
    private String instructor;
    private int duration;
    private List<String> schedule;

    public Lesson(String courseName, String instructor, int duration) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = duration;
        schedule = new ArrayList<String>();
    }

    public void addSchedule(String event){
        schedule.add(event);
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
