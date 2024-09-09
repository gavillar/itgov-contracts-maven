package com.it.governance.service;

import com.it.governance.model.ThirdPartySubstituteEmployee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ThirdPartySubstituteEmployeeService {

    List<ThirdPartySubstituteEmployee> getAllSubstituteEmployees();
    void saveSubstituteEmployee(ThirdPartySubstituteEmployee thirdPartySubstituteEmployee);
    ThirdPartySubstituteEmployee getEmployeeSubstituteById(long id);
    void deleteEmployeeById(long id);

}
