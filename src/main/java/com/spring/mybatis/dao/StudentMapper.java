package com.spring.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mybatis.model.Student;

@Mapper
public interface StudentMapper {
	/**
	 * find all the students.
	 */
	List<Student> findAll();
}