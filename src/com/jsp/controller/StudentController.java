package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(4);
		student.setName("Kishan");
		student.setEmail("rutik@gmail.com");
		student.setGender("Male");
		student.setCno(1155657892);
		
		StudentDao studentDao= new StudentDao();
		studentDao.saveStudent(student);
		

	}

}
