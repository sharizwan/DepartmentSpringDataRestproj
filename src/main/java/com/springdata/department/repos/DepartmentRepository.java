package com.springdata.department.repos;

import org.springframework.data.repository.CrudRepository;

import com.springdatarest.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
