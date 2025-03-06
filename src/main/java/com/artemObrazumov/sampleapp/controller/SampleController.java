package com.artemObrazumov.sampleapp.controller;

import com.artemObrazumov.sampleapp.entity.SampleData;
import com.artemObrazumov.sampleapp.repository.SampleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    private final SampleRepository sampleRepository;

    public SampleController(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    @GetMapping
    public String index() {
        return "It's working!";
    }

    @GetMapping("/sample-data")
    public List<SampleData> getSampleData() {
        return sampleRepository.findAll();
    }
}
