package com.springboot.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.microsoft.azure.cosmosdb.DocumentClientException;
import com.springboot.Exceptions.Exceptions.InvalidIdException;
import com.springboot.model.Student;

import rx.Observable;

public interface dao {;

	Observable<List<Student>> findAll();
	Observable<Student> findById(String id,String course);
	Observable<Student> save(Student s);
	Observable<Student> update(String id, Student student);
	void deleteById(String id,String course);
	

}
