package com.heavylink.service.implementation;

import com.heavylink.model.Exam;
import com.heavylink.repository.IExamRepository;
import com.heavylink.service.IExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamService implements IExamService {
  // Autowired
  private final IExamRepository repo;

  @Override
  public Exam save(Exam exam) throws Exception {
    return repo.save(exam);
  }

  @Override
  public Exam update(Exam exam, Integer id) throws Exception {
    // EVALUAR CON EL ID
    // API REFLECTION
    exam.setIdExam(id);
    return repo.save(exam);
  }

  @Override
  public List<Exam> findAll() throws Exception {
    return repo.findAll();
  }

  @Override
  public Exam findById(Integer id) throws Exception {
    return repo.findById(id).orElse(new Exam());
  }

  @Override
  public void delete(Integer id) throws Exception {
    repo.deleteById(id);
  }
}
