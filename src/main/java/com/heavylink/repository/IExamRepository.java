package com.heavylink.repository;

import com.heavylink.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExamRepository extends JpaRepository<Exam, Integer> {
}
