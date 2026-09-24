package edu.bellevue.cis530.week02.repository;
import edu.bellevue.cis530.week02.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Long, Student> students = new HashMap<>();
    Long studentCount = 0L;

    // Create Methods
    public Student save(Student newStudent) {
        newStudent.setId(++studentCount);
        students.put(studentCount, newStudent);
        return findById((newStudent.getId()));
    }

    // Read Methods
    public List<Student> findAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student findById(Long id) {
        return students.get(id);
    }

    // Update Methods
    public Student update(Long studentId, Student updatedStudent) {
        students.replace(studentId, updatedStudent);
        return students.get(studentId);
    }

    // Delete Methods
    public void delete(Long id) {
        students.remove(id);
    }

}
