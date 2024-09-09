package com.it.governance.repository;

import com.it.governance.model.ThirdPartySubstituteEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThirdPartySubstituteEmployeeRepository extends JpaRepository<ThirdPartySubstituteEmployee, Long> {

}
