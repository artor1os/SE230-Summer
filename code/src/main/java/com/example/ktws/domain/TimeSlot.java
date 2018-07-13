package com.example.ktws.domain;

import com.example.ktws.util.Day;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "time_slot")
public class TimeSlot {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String startTime;
    private String endTime;

    private Day day;

    @ManyToMany(mappedBy = "timeSlots", fetch = FetchType.EAGER)
    private Set<Course> courses = new HashSet<>();

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            return;
        }
        courses.add(course);
        course.addTimeSlot(this);
    }

    public void removeCourse(Course course) {
        if (!courses.contains(course)) {
            return;
        }
        courses.remove(course);
        course.removeTimeSlot(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
