package com.artemObrazumov.sampleapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sampledata")
public class SampleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public SampleData() {
    }

    public SampleData(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
