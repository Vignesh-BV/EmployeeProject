package com.Employee.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Employee.Entity.Employee;
import com.Employee.Exception.NameException;
import com.Employee.Repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String postThis1(Employee v) {
		er.save(v);
		return "Posted Success";
	}

	public Employee getId1(int a) {
		return er.findById(a).get();
	}

	public List<Employee> getThis1() {
		return er.findAll();
	}

	public List<Employee> getbyName(String a) {
		return er.getbyName(a);
	}

	public List<Employee> getbyName(int age, int experience) {
		return er.getbyName(age, experience);
	}

	public List<Employee> getbyEmployeeName(String a) {
		return er.getbyEmployeeName(a);
	}

	public List<Employee> getStartsWith(char a, char b) {
		return er.getStartsWith(a, b);
	}

	public String getOneField(int a) {
		return er.findById(a).get().getName();
	}

	public String getName(int a) {
		return er.findById(a).get().getName();
	}

	public Employee getAge(int a) {
		return er.findById(a).get();
	}
}
