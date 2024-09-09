package com.it.governance.service;

import com.it.governance.model.ThirdPartySubstituteEmployee;
import com.it.governance.repository.ThirdPartySubstituteEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThirdPartyEmployeeSubstituteServiceImpl implements ThirdPartySubstituteEmployeeService {

    @Autowired
    private ThirdPartySubstituteEmployeeRepository thirdPartySubstituteEmployeeRepository;
    @Override
    public List<ThirdPartySubstituteEmployee> getAllSubstituteEmployees() {
        return thirdPartySubstituteEmployeeRepository.findAll();
    }

    @Override
    public void saveSubstituteEmployee(ThirdPartySubstituteEmployee thirdPartySubstituteEmployee) {
        this.thirdPartySubstituteEmployeeRepository.save(thirdPartySubstituteEmployee);
    }

    @Override
    public ThirdPartySubstituteEmployee getEmployeeSubstituteById(long id) {

        return null;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.thirdPartySubstituteEmployeeRepository.deleteById(id);
    }
}
