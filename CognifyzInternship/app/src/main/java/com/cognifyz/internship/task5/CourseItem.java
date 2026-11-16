package com.cognifyz.internship.task5;

public class CourseItem {
    private String title;
    private String description;
    private String rating;
    private String duration;
    private String color;

    public CourseItem(String title, String description, String rating, String duration, String color) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.duration = duration;
        this.color = color;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getRating() { return rating; }
    public String getDuration() { return duration; }
    public String getColor() { return color; }
}
