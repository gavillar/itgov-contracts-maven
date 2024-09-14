package com.it.governance.repository;

import com.it.governance.model.VendorContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorContactRepository extends JpaRepository<VendorContact, Long> {
}
