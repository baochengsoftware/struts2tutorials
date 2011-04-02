package com.aurifa.struts2.tutorial.dao;

import java.util.*;

import com.aurifa.struts2.tutorial.model.Department;

public class DepartmentNoDBdao implements DepartmentDao {
    private static List departments;
    private static Map departmentsMap;
    static {
        departments = new ArrayList();
        departments.add(new Department( new Integer(100), "Accounting" ));
        departments.add(new Department( new Integer(200), "R & D"));
        departments.add(new Department( new Integer(300), "Sales" ));
        departmentsMap = new HashMap();
        Iterator iter = departments.iterator();
        while( iter.hasNext() ) {
            Department dept = (Department)iter.next();
            departmentsMap.put(dept.getDepartmentId(), dept );
        }

     }
    public List getAllDepartments() {
        return departments;
    }
    public Map getDepartmentsMap() {
        return departmentsMap;
    }
}
