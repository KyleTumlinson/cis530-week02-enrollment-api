package edu.bellevue.cis530.week02.service;

import edu.bellevue.cis530.week02.exception.NoStudentInListException;
import edu.bellevue.cis530.week02.exception.StudentNotFoundException;
import edu.bellevue.cis530.week02.repository.StudentRepository;
import edu.bellevue.cis530.week02.model.Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Create Service functions
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read Service functions
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAllStudents();
        if(students.isEmpty()){
            throw new NoStudentInListException("No students in list");
        }
        return students;
    }

    public Student getStudentById(Long id) {
        Student foundStudent = studentRepository.findById(id);
        if (foundStudent == null){
            throw new StudentNotFoundException(id);
        }
        return foundStudent;
    }

    // Update Service functions
    public Student updateStudent(Long id, Student newStudent) {
        Student updatedStudent = studentRepository.update(id, newStudent);
        if (updatedStudent == null){
            throw new StudentNotFoundException(id);
        }
        return updatedStudent;
    }

    // Delete Service functions
    public void deleteStudent(Long id) {
        Student foundStudent = studentRepository.findById(id);
        if (foundStudent == null){
            throw new StudentNotFoundException(id);
        }
        studentRepository.delete(id);
    }
}
