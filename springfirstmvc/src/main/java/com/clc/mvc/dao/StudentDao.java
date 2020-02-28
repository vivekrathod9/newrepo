package com.clc.mvc.dao;

import java.util.List;

import com.clc.mvc.entity.StudentEntity;

public interface StudentDao {
	
	public boolean saveStudent(StudentEntity entity);
	public boolean removeStudent(int entityId);
	public StudentEntity fetchStudent(int entityId);
	public List<StudentEntity> fetchAllStduent();
	public StudentEntity modifyStudent(StudentEntity entity);
}
