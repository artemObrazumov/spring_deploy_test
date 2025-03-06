package com.artemObrazumov.sampleapp.repository;

import com.artemObrazumov.sampleapp.entity.SampleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleData, Long> {
}
