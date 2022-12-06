package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControllerUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(32);
		student.setName("Kishan");
		student.setEmail("rutik@gmail.com");
		student.setGender("Male");
		student.setCno(1155657892);
		
		StudentDao studentDao= new StudentDao();
		studentDao.updateStudent(student);
	}

}
