package com.Employee.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Exception.NameException;
import com.Employee.Service.EmployeeService;

@RestController
@RequestMapping(value = "/Employee")
public class EmployeeController {
	@Autowired // Dependency inject
	EmployeeService es;

	@PostMapping(value = "/PostEmployee")
	public String postThis1(@RequestBody Employee v) {
		return es.postThis1(v);
	}

	@GetMapping(value = "/PostEmployee1")
	public Employee getId1(@RequestParam int a) {
		return es.getId1(a);
	}

	@GetMapping(value = "/PostEmployee2")
	public List<Employee> getThis1() {
		return es.getThis1();
	}

	@GetMapping("/PostEmployee3")
	public List<String> getName() {
		return es.getName();
	}

	@GetMapping(value = "/PostEmployee4")
	public Employee getMax() {
		return es.getMax();
	}

	@GetMapping(value = "/PostEmployee5")
	public int addAge() {
		return es.addAge();
	}

	@GetMapping(value = "/PostEmployee6")
	public double avgAge() {
		return es.avgAge();
	}

	@GetMapping(value = "/PostEmployee7")
	public List<Employee> getObject() {
		return es.getObject();
	}

	@GetMapping(value = "/PostEmployee8")
	public List<Employee> getSort() {
		return es.getSort();
	}

	@GetMapping("/PostEmployee9")
	public Map<String, Long> filedCount() {
		return es.filedCount();
	}

	@GetMapping(value = "/PostEmployee10/{a}") // Query Interface Implementation
	public List<Employee> getbyName(@PathVariable String a) {
		return es.getbyName(a);
	}

	@GetMapping(value = "/PostEmployee11/{age}/{experience}")
	public List<Employee> getbyName(@PathVariable int age, @PathVariable int experience) {
		return es.getbyName(age, experience);
	}

	@GetMapping(value = "/PostEmployee12/{a}")
	public List<Employee> getbyEmployeeName(@PathVariable String a) {
		return es.getbyEmployeeName(a);
	}

	@GetMapping(value = "/PostEmployee13/{a}/{b}")
	public List<Employee> getStartsWith(@PathVariable char a, @PathVariable char b) {
		return es.getStartsWith(a, b);
	}

	@GetMapping(value = "/getOneField/{a}")
	public String getOneField(@PathVariable int a) {
		return es.getOneField(a);
	}

	// Exception
	@GetMapping(value = "/ExceptionThrow1/{a}")
	public String getName(@PathVariable int a) throws NameException {
		return es.getName(a);
	}

	@GetMapping(value = "/ExceptionThrow2/{a}")
	public Employee getAge(@PathVariable int a) throws NameException {
		return es.getAge(a);
	}

	@GetMapping(value = "/PostEmployee13")
	public List<Character> getChar() {
		return es.getChar();
	}

	@GetMapping(value = "/PostEmployee14")
	public List<Object> getNamSal() {
		return es.getNamSal();
	}
}
