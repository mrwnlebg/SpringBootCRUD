package com.learning.springmvclearning;

public class Topic {
    private String Name;
    private Integer Id;
    private String Description;

    public Topic(String name, Integer id, String description) {
        Name = name;
        Id = id;
        Description = description;
    }
    public Topic() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
