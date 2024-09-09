package com.it.governance.model;

import jakarta.persistence.*;

@Entity
@Table(name = "substitute-third-party-employee")
public class ThirdPartySubstituteEmployee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name = "completeName")
    private String completeName;

    @Column(name = "email")
    private String email;

    @Column(name = "completeNameSubstitute")
    private String completeNameSubstitute;

    @Column(name = "emailSubstitute")
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
