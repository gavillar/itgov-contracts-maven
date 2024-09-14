package com.it.governance.service;

import com.it.governance.model.VendorContact;

import java.util.List;

public interface VendorContactService {
    List<VendorContact> getAllVendorContact();
    void saveVendorContact(VendorContact vendorContact);
    VendorContact getVendorContactById(long id);
    void deleteContactById(long id);
}
