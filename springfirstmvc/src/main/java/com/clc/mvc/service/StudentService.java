package com.clc.mvc.service;

import java.util.List;

import com.clc.mvc.bean.StudentBean;

public interface StudentService {

	public boolean addStudent(StudentBean bean);

	public boolean deleteStudent(int beanId);

	public StudentBean getStudent(int beanId);

	public List<StudentBean> getAll();

	public StudentBean updateStudent(StudentBean bean);
}
