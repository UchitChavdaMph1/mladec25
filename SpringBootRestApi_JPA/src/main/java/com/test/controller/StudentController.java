package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.test.entity.Student;
import com.test.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/student/v1/api")
@Tag(name = "Student Api", description = "Student CRUDoperations with JPA")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	Logger logger = LoggerFactory.getLogger(StudentController.class);
	@GetMapping("/log")
	@Operation(description = "Logging", summary = "slf4j")
	public String log() {
		logger.trace("Log level : TRACE");
		logger.info("Log Level : INFO");
		logger.debug("Log Level : DEBUG");
		logger.error("Log Level : ERROR");
		logger.warn("Log Level : WARN");
		
		return "You can check the output in log / log file ";
	}
	
	
	@PostMapping(value="/create")
	@Operation(method = "CreateStudentMethod" ,description = "add student to DB")
	public ResponseEntity<Student> createStudent(@RequestBody Student std) {
		Student obj = service.ceateStudent(std);
		String str = String.valueOf(obj.getId());
		logger.info(str);
		logger.info(obj.getName());
		logger.info(obj.getDepartment());
		logger.info(obj.getCollege());
		if (std == null) {
			return new ResponseEntity<>(obj, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(obj, HttpStatus.CREATED);
		}
	}
	
	@GetMapping(value="/{id}")
	@Operation(method = "getStudentById" ,description = "get student from db by id")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable int id) {
		Optional<Student> obj = service.getStudentById(id);
		if (id <= 0) {
			return new ResponseEntity<>(obj, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		}
	}
	
	
	@PutMapping(value="/{id}")
	@Operation(method = "updateStudentById" ,description = "update student data in DB")
	public ResponseEntity<Student> updateStudentById(@PathVariable int id ,@RequestBody Student std) {
		std.setId(id);
		Student obj = service.updateStudentById(std);
		if (id <= 0) {
			return new ResponseEntity<>(obj, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		}
	}
	
	
	@DeleteMapping(value="/{id}")
	@Operation(method = "deleteStudentById" ,description = "delete student from DB")
	public ResponseEntity<List<Student>> deleteStudentById(@PathVariable int id) {
		List<Student> obj = service.deleteStudentById(id);
		if (id <= 0) {
			return new ResponseEntity<>(obj, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		}
	}
	
	 
	@GetMapping(value="/list")
	@Operation(method = "getAllStudents" ,description = "get all students from DB")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> obj = service.getAllStudents();
		if (obj.isEmpty()) {
			return new ResponseEntity<>(obj, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/list/{name}")
	@Operation(method="getStudentByName", description = "get students data from DB using name")
	public ResponseEntity<Optional<Student>> getStudentByName(@PathVariable String name) {
		Optional<Student> obj =  service.getStudentByName(name);
		if (name == null) {
			return new ResponseEntity<>(obj, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		}
	}
	
	
	
	@GetMapping("/list/{deparement}")
	@Operation(method="getStudentByName", description = "get students data from DB using department")
	public ResponseEntity<List<Student>> getStudentByDepartment(@PathVariable String department) {
		List<Student> obj =  service.getStudentByDepartment(department);
		if (obj.isEmpty()) {
			return new ResponseEntity<>(obj, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		}
	}

}
