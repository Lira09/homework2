package com.geek.homework2;

public class Cell {
    private String id;
    private String title;
    private String description;
    private String data;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Cell(String id, String title, String  description,String data) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.data = data;
    }
}
