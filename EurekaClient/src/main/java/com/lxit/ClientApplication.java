package com.lxit;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lxit.bean.Student;
import com.lxit.dao.StudentDao;
//开启Spring Boot
@SpringBootApplication
//rest控制器
@RestController
public class ClientApplication {

	@Autowired
	StudentDao student;
	
	@RequestMapping("/query")
	List<Student> query() {
		List<Student> list = new ArrayList<>();
		list = student.query();
		return list;
	}
	
	@RequestMapping("/say")
	String add() {
		return "hello world!";
	}

	public static void main(String[] args) {
	new SpringApplicationBuilder(ClientApplication.class).web(true).run(args);
}

}
