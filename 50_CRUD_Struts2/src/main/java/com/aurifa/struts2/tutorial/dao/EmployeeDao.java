package com.aurifa.struts2.tutorial.dao;

import java.util.List;

import com.aurifa.struts2.tutorial.model.Employee;

public interface EmployeeDao {
    public List getAllEmployees();
    public Employee getEmployee(Integer id);
    public void update(Employee emp);
    public void insert(Employee emp);
    public void delete(Integer id);
}
