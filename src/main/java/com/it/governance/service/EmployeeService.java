package com.it.governance.service;

import java.util.List;

import com.it.governance.model.ThirdPartyEmployee;

public interface EmployeeService {
	List<ThirdPartyEmployee> getAllEmployees();
	void saveEmployee(ThirdPartyEmployee thirdPartyEmployee);
	ThirdPartyEmployee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
