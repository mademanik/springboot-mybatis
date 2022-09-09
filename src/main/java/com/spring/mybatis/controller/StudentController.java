package com.spring.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mybatis.dao.StudentMapper;
import com.spring.mybatis.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentMapper studentMapper;

	@RequestMapping("/findAll")
	@ResponseBody
	public List<Student> getAll() {
		return studentMapper.findAll();
	}

}
