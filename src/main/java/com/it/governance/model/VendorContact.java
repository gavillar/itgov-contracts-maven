package com.it.governance.model;

import com.it.governance.security.AttributeEncryptor;
import jakarta.persistence.*;

@Entity
@Table(name = "vendor_contact")
public class VendorContact {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Convert(converter = AttributeEncryptor.class)
    @Column(name = "vendor")
    private String vendor;
    @Convert(converter = AttributeEncryptor.class)
    @Column(name = "contact")
    private String contact;
    @Convert(converter = AttributeEncryptor.class)
    @Column(name = "email")
    private String email;
    @Convert(converter = AttributeEncryptor.class)
    @Column(name = "cellPhone")
    private String cellPhone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }


}
