package com.lxit.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.bean.Student;
@MapperScan
public interface StudentDao {
	public List<Student> query();
}
