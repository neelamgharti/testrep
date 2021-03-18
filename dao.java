package com.springboot.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.microsoft.azure.cosmosdb.DocumentClientException;
import com.springboot.Exceptions.Exceptions.InvalidIdException;
import com.springboot.model.Student;

import rx.Observable;

public interface dao {;
	//To fetch all the documents from the student Container
	Observable<List<Student>> findAll();
	//To fetch document by id from the student container
	Observable<Student> findById(String id,String course);
	// To save a document in the student container
	Observable<Student> save(Student s);
	// To update an existing document in the student container
	Observable<Student> update(String id, Student student);
	// To delete the document by id from the student container
	void deleteById(String id,String course);
	

}
