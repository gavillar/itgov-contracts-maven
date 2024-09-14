package com.it.governance.service;

import com.it.governance.model.VendorContact;
import com.it.governance.repository.VendorContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendorContactImpl implements VendorContactService {

    @Autowired
    VendorContactRepository vendorContactRepository;
    @Override
    public List<VendorContact> getAllVendorContact() {
        return vendorContactRepository.findAll();
    }

    @Override
    public void saveVendorContact(VendorContact vendorContact) {
        vendorContactRepository.save(vendorContact);
    }

    @Override
    public VendorContact getVendorContactById(long id) {
        return vendorContactRepository.getReferenceById(id);
    }

    @Override
    public void deleteContactById(long id) {
        vendorContactRepository.deleteById(id);
    }
}
