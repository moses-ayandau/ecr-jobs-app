package com.moses.jobs;

import java.util.List;

public class Job {
    private String title;
    private String description;
    private List<String> skills;

    public Job(String title, String description, List<String> skills) {
        this.title = title;
        this.description = description;
        this.skills = skills;
    }

    // Getters and Setters
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

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}