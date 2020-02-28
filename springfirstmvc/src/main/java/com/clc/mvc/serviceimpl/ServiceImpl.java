package com.clc.mvc.serviceimpl;

import java.util.List;

import com.clc.mvc.bean.StudentBean;
import com.clc.mvc.service.StudentService;

public class ServiceImpl implements StudentService {

	@Override
	public boolean addStudent(StudentBean bean) {
		return false;
	}

	@Override
	public boolean deleteStudent(int beanId) {
		return false;
	}

	@Override
	public StudentBean getStudent(int beanId) {
		return null;
	}

	@Override
	public List<StudentBean> getAll() {
		return null;
	}

	@Override
	public StudentBean updateStudent(StudentBean bean) {
		return null;
	}

}
