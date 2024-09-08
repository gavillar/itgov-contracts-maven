package com.it.governance.service;

import java.util.List;
import java.util.Optional;

import com.it.governance.model.ThirdPartyEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.governance.repository.ThirdPartyEmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private ThirdPartyEmployeeRepository thirdPartyEmployeeRepository;

	@Override
	public List<ThirdPartyEmployee> getAllEmployees() {
		return thirdPartyEmployeeRepository.findAll();
	}

	@Override
	public void saveEmployee(ThirdPartyEmployee thirdPartyEmployee) {
		 this.thirdPartyEmployeeRepository.save(thirdPartyEmployee);
	}

	@Override
	public ThirdPartyEmployee getEmployeeById(long id) {
		Optional<ThirdPartyEmployee> optional = thirdPartyEmployeeRepository.findById(id);
		ThirdPartyEmployee thirdPartyEmployee = null;
		if(optional.isPresent()) {
			thirdPartyEmployee = optional.get();
		} else {
			throw new RuntimeException("Employee not found");
		}
		return thirdPartyEmployee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.thirdPartyEmployeeRepository.deleteById(id);;
	}
}
