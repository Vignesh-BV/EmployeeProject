package com.Employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "select * from employeetable where name like ?", nativeQuery = true)
	public List<Employee> getbyName(String a);

	@Query(value = "select * from employeetable where age=? && experience=?", nativeQuery = true)
	public List<Employee> getbyName(int age, int experience);

	@Query(value = "select * from employeetable where name like ?", nativeQuery = true)
	public List<Employee> getbyEmployeeName(String a);

	@Query(value = "select * from employeetable where name like ?% || ?%", nativeQuery = true)
	public List<Employee> getStartsWith(char a, char b);
}
