package com.aurifa.struts2.tutorial.service;

import java.util.List;

import com.aurifa.struts2.tutorial.model.Employee;

public interface EmployeeService {
    public List getAllEmployees();
    public void updateEmployee(Employee emp);
    public void deleteEmployee(Integer id);
    public Employee getEmployee(Integer id);
    public void insertEmployee(Employee emp);
}
