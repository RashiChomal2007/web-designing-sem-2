package com.example.employeeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeapi.entity.Employee;
import com.example.employeeapi.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Add Employee
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get Employee By ID
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    // Update Employee
    public Employee updateEmployee(int id, Employee employeeDetails) {
        Employee employee = repository.findById(id).orElse(null);

        if (employee != null) {
            employee.setName(employeeDetails.getName());
            employee.setDepartment(employeeDetails.getDepartment());
            employee.setSalary(employeeDetails.getSalary());

            return repository.save(employee);
        }

        return null;
    }

    // Delete Employee
    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "Employee deleted successfully!";
    }
}