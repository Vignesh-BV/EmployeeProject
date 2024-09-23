package com.Employee.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Employee.Exception.NameException;

import com.Employee.Dao.EmployeeDao;
import com.Employee.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String postThis1(@RequestBody Employee v) {
		return ed.postThis1(v);
	}

	public Employee getId1(int a) {
		return ed.getId1(a);

	}

	public List<Employee> getThis1() {
		return ed.getThis1();
	}

	public List<String> getName() {
		List<Employee> emp = ed.getThis1();
		List<String> employeName = emp.stream().map(x -> x.getName()).collect(Collectors.toList());
		return employeName;
	}

	public Employee getMax() {
		List<Employee> empMax = ed.getThis1();
		Employee max = empMax.stream().max(Comparator.comparing(Employee::getSalary)).get();
		return max;
	}

	public int addAge() {
		List<Employee> empAdd = ed.getThis1();
		int sumAge = empAdd.stream().map(x -> x.getAge()).collect(Collectors.summingInt(a -> a));
		return sumAge;
	}

	public double avgAge() {
		List<Employee> empAdd = ed.getThis1();
		double averagegAge = empAdd.stream().map(x -> x.getAge()).collect(Collectors.averagingDouble(a -> a));
		return averagegAge;
	}

	public List<Employee> getObject() {
		List<Employee> temp = ed.getThis1();
		List<Employee> target = temp.stream().filter(x -> x.getName().startsWith("S") && x.getSalary() > 50000)
				.collect(Collectors.toList());
		return target;
	}

	public List<Employee> getSort() {
		List<Employee> gSort = ed.getThis1();
		List<Employee> sort = gSort.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		return sort;
	}

	public Map<String, Long> filedCount() {
		List<Employee> fCount1 = ed.getThis1();
		Map<String, Long> fCount2 = fCount1.stream()
				.collect(Collectors.groupingBy(a -> a.getName(), Collectors.counting()));
		return fCount2;
	}

	public List<Employee> getbyName(String a) {
		return ed.getbyName(a);
	}

	public List<Employee> getbyName(int age, int experience) {
		return ed.getbyName(age, experience);
	}

	public List<Employee> getbyEmployeeName(String a) {
		return ed.getbyEmployeeName(a);
	}

	public List<Employee> getStartsWith(char a, char b) {
		return ed.getStartsWith(a, b);
	}

	public String getOneField(@PathVariable int a) {
		return ed.getOneField(a);
	}

	// Exception
//	public String getName(int a) throws NameException {
//		try {
//		if (ed.getName(a).equals("Abc")) {
//			return ed.getName(a);
//		}
//		
//		else {
//			throw new NameException("Abc is not in that Id");
//		}
//		}
//		catch (NameException ne) {
//			return ne.getMessage();
//	}
//		finally {
//			return "Success";
//		}

	public String getName(int a) throws NameException {

		if (ed.getName(a).equals("Abc")) {
			return ed.getName(a);
		}

		else {
			throw new NameException("Abc is not in that Id");
		}

	}

	public Employee getAge(int a) throws NameException {
		if (ed.getAge(a).getAge() > 60) {
			return ed.getAge(a);
		} else {
			throw new NameException("Age Exception");
		}
	}

	public List<Character> getChar() {
		List<Employee> am = ed.getThis1();
		List<Character> pm = am.stream().map(x -> x.getName().charAt(x.getName().length() - 1))
				.collect(Collectors.toList());
		return pm;
	}

	public List<Object> getNamSal() {
		List<Employee> am = ed.getThis1();
		List<Object> pm = am.stream().map(x -> x.getName() + "-" + x.getSalary()).collect(Collectors.toList());
		return pm;
	}
}
