package org.sourav;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String courseName;
    private int duration;
    private String type;
    private int fees;

    public Course(String courseName, int duration, String type, int fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.type = type;
        this.fees = fees;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                ", fees=" + fees +
                '}';
    }
}
