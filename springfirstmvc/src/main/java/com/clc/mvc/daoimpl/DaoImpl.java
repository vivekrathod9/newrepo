package com.clc.mvc.daoimpl;

import java.util.List;

import com.clc.mvc.dao.StudentDao;
import com.clc.mvc.entity.StudentEntity;

public class DaoImpl implements StudentDao {

	@Override
	public boolean saveStudent(StudentEntity entity) {
		return false;
	}

	@Override
	public boolean removeStudent(int entityId) {
		return false;
	}

	@Override
	public StudentEntity fetchStudent(int entityId) {
		return null;
	}

	@Override
	public List<StudentEntity> fetchAllStduent() {
		return null;
	}

	@Override
	public StudentEntity modifyStudent(StudentEntity entity) {
		return null;
	}

}
