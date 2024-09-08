package com.it.governance.model;

import jakarta.persistence.*;

//@Entity
//@Table(name = "substitute-third-party-employee")
public class ThirdPartySubstituteEmployee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "legalOps")
    private String legalOps;

    @Column(name = "orderService")
    private String orderService;

    @Column(name = "functionName")
    private String functionName;

    @Column(name = "role")
    private String role;

    @Column(name = "completeName")
    private String completeName;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "subistituionDate")
    private String subistituionDate;


    @Column(name = "vertical")
    private String vertical;

    @Column(name = "squad")
    private String squad;

    @Column(name = "alocation")
    private String alocation;

    @Column(name = "oldEmail")
    private String oldEmail;

    @Column(name = "manager")
    private String manager;
}
