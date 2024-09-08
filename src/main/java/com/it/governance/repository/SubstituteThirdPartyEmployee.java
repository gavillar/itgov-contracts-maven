package com.it.governance.repository;

import com.it.governance.model.ThirdPartyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubstituteThirdPartyEmployee extends JpaRepository<ThirdPartyEmployee, Long> {

}