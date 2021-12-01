package com.example.demo;

class EmployeeNotFound extends RuntimeException {

	  EmployeeNotFound(Long id) {
	    super("Could not find employee " + id);
	  }
	}