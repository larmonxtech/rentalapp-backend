package com.heavylink.service;

import com.heavylink.model.Exam;

import java.util.List;

public interface IExamService {
  Exam save(Exam exam) throws  Exception;
  Exam update(Exam exam, Integer id) throws  Exception;
  List<Exam> findAll() throws  Exception;
  Exam findById(Integer id) throws  Exception;
  void delete(Integer id) throws  Exception;
}
