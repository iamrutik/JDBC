package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class SaveMultiple {
	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();	
		Student s1=new Student();
		s1.setId(32);
		s1.setName("Rutik");
		s1.setEmail("rutik@gmail.com");
		s1.setGender("male");
		s1.setCno(986543);
		
		Student s2=new Student();
		s2.setId(33);
		s2.setName("Ankit");
		s2.setEmail("ankit@gmail.com");
		s2.setGender("male");
		s2.setCno(9865432);
		
		Student s3=new Student();
		s3.setId(34);
		s3.setName("Akshay");
		s3.setEmail("ak@gmail.com");
		s3.setGender("male");
		s3.setCno(9865437);
		
		Student s4=new Student();
		s4.setId(35);
		s4.setName("Kishan");
		s4.setEmail("ks@gmail.com");
		s4.setGender("male");
		s4.setCno(9865438);
		
		a.add(s4);
		a.add(s3);
		a.add(s2);
		a.add(s1);
		
		StudentDao studentDao= new StudentDao();
		studentDao.addmultipleStudent(a);
	}

}
