package com.greatlearning.studentmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatlearning.studentmanagement.entity.Student;
import com.greatlearning.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	@Transactional
	public List<Student> findAll() {
		List<Student> student = studentRepository.findAll();
		return student;
	}

	@Override
	@Transactional
	public Student findById(int id) {
		Student student = studentRepository.findById(id).orElse(null);
		return student;
	}

	@Override
	@Transactional
	public void save(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		studentRepository.deleteById(id);
		
	}

	
	
}
