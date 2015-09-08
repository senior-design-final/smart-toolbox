package com.beingjavaguys.dao;

import java.util.List;

import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Student;

public interface DataDao {
	public int insertRow(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int updateRow(Employee employee);

	public int deleteRow(int id);
        
     

}
