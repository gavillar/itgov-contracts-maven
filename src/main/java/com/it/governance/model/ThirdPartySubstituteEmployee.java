package com.it.governance.model;

import com.it.governance.security.AttributeEncryptor;
import jakarta.persistence.*;

@Entity
@Table(name = "substitute_third_party_employee")
public class ThirdPartySubstituteEmployee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "complete_name")
    private String completeName;

    @Convert(converter = AttributeEncryptor.class)
    @Column(name = "email")
    private String email;
    @Convert(converter = AttributeEncryptor.class)
    @Column(name = "complete_name_substitute")
    private String completeNameSubstitute;
    @Convert(converter = AttributeEncryptor.class)
    @Column(name = "email_substitute")
    private String emailSubstitute;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompleteNameSubstitute() {
        return completeNameSubstitute;
    }

    public void setCompleteNameSubstitute(String completeNameSubstitute) {
        this.completeNameSubstitute = completeNameSubstitute;
    }

    public String getEmailSubstitute() {
        return emailSubstitute;
    }

    public void setEmailSubstitute(String emailSubstitute) {
        this.emailSubstitute = emailSubstitute;
    }
}
