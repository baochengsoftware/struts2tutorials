package com.aurifa.struts2.tutorial.service;

import java.util.List;

import com.aurifa.struts2.tutorial.dao.DepartmentDao;
import com.aurifa.struts2.tutorial.dao.DepartmentNoDBdao;

public class DepartmentDaoService implements DepartmentService {
    private DepartmentDao dao;

    public DepartmentDaoService() {
        this.dao = new DepartmentNoDBdao();
    }

    public List getAllDepartments() {
        return dao.getAllDepartments();
    }
}
