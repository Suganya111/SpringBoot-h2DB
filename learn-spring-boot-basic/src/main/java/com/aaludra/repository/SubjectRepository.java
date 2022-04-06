package com.aaludra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aaludra.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
