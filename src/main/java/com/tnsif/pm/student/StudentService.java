package com.tnsif.pm.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
	@Autowired
 private StudentRepository repo;
	
	public List<Student> listAll()
	{
		return repo.findAll();
		
	}
	public Student get(Integer Id) {
		return repo.findById(Id).get();
	}     
	
	public void save(Student student) {
		
		repo.save(student);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
}
