package com.aurifa.struts2.tutorial.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.aurifa.struts2.tutorial.model.Employee;
import com.aurifa.struts2.tutorial.service.DepartmentDaoService;
import com.aurifa.struts2.tutorial.service.DepartmentService;
import com.aurifa.struts2.tutorial.service.EmployeeDaoService;
import com.aurifa.struts2.tutorial.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	private Log logger = LogFactory.getLog(this.getClass());

	private static EmployeeService empService = new EmployeeDaoService();

	private static DepartmentService deptService = new DepartmentDaoService();

	private Employee employee;

	private List employees;

	private List departments;

	public void prepare() throws Exception {
		departments = deptService.getAllDepartments();
		if (employee != null && employee.getEmployeeId() != null) {
			employee = empService.getEmployee(employee.getEmployeeId());
		}
	}

	public String doSave() {
		if (employee.getEmployeeId() == null) {
			empService.insertEmployee(employee);
		} else {
			empService.updateEmployee(employee);
		}
		return SUCCESS;
	}

	public String doDelete() {
		empService.deleteEmployee(employee.getEmployeeId());
		return SUCCESS;
	}

	public String doList() {
		employees = empService.getAllEmployees();
		return SUCCESS;
	}

	public String doInput() {
		return INPUT;
	}

	/**
	 * @return Returns the employee.
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 *            The employee to set.
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return Returns the employees.
	 */
	public List getEmployees() {
		return employees;
	}

	/**
	 * @return Returns the departments.
	 */
	public List getDepartments() {
		return departments;
	}
}
