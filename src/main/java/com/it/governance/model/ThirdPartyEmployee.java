package com.it.governance.model;

import com.it.governance.security.AttributeEncryptor;
import jakarta.persistence.*;

@Entity
@Table(name = "third_party_employee")
public class ThirdPartyEmployee {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "legalOps")
	private String legalOps;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "orderService")
	private String orderService;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "functionName")
	private String functionName;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "role")
	private String role;
	
	@Column(name = "completeName")
	private String completeName;

	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "email")
	private String email;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "fup")
	private String fup;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "statusOrderService")
	private String statusOrderService;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "vendor")
	private String vendor;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "initialDateLegalOps")
	private String initialDateLegalOps;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "finalDateLegalOps")
	private String finalDateLegalOps;

	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "initialDateRecourse")
	private String initialDateRecourse;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "initialDateContract")
	private String initialDateContract;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "finalDateContract")
	private String finalDateContract;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "warningMaturity")
	private String warningMaturity;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "exitDate")
	private String exitDate;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "valueContract")
	private String valueContract;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "analysisHR")
	private String analysisHR;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "vertical")
	private String vertical;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "squad")
	private String squad;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "bU")
	private String bU;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "alocation")
	private String alocation;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "borrowedTo")
	private String borrowedTo;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "observation")
	private String observation;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "oldEmail")
	private String oldEmail;
	@Convert(converter = AttributeEncryptor.class)
	@Column(name = "manager")
	private String manager;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLegalOps() {
		return legalOps;
	}
	public void setLegalOps(String legalOps) {
		this.legalOps = legalOps;
	}
	public String getOrderService() {
		return orderService;
	}
	public void setOrderService(String orderService) {
		this.orderService = orderService;
	}
	public String getFunctionName() { return functionName;}
	public void setFunctionName(String functionName) {this.functionName = functionName; }
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompleteName() {
		return completeName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFup() {
		return fup;
	}
	public void setFup(String fup) {
		this.fup = fup;
	}
	public String getStatusOrderService() {
		return statusOrderService;
	}
	public void setStatusOrderService(String statusOrderService) {
		this.statusOrderService = statusOrderService;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getInitialDateLegalOps() {
		return initialDateLegalOps;
	}
	public void setInitialDateLegalOps(String initialDateLegalOps) {
		this.initialDateLegalOps = initialDateLegalOps;
	}
	public String getFinalDateLegalOps() {
		return finalDateLegalOps;
	}
	public void setFinalDateLegalOps(String finalDateLegalOps) {
		this.finalDateLegalOps = finalDateLegalOps;
	}
	public String getInitialDateRecourse() {
		return initialDateRecourse;
	}
	public void setInitialDateRecourse(String initialDateRecourse) {
		this.initialDateRecourse = initialDateRecourse;
	}
	public String getInitialDateContract() {
		return initialDateContract;
	}
	public void setInitialDateContract(String initialDateContract) {
		this.initialDateContract = initialDateContract;
	}
	public String getFinalDateContract() {
		return finalDateContract;
	}
	public void setFinalDateContract(String finalDateContract) {
		this.finalDateContract = finalDateContract;
	}
	public String getWarningMaturity() {
		return warningMaturity;
	}
	public void setWarningMaturity(String warningMaturity) {
		this.warningMaturity = warningMaturity;
	}
	public String getExitDate() {
		return exitDate;
	}
	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}
	public String getValueContract() {
		return valueContract;
	}
	public void setValueContract(String valueContract) {
		this.valueContract = valueContract;
	}
	public String getAnalysisHR() {
		return analysisHR;
	}
	public void setAnalysisHR(String analysisHR) {
		this.analysisHR = analysisHR;
	}
	public String getVertical() {
		return vertical;
	}
	public void setVertical(String vertical) {
		this.vertical = vertical;
	}
	public String getSquad() {
		return squad;
	}
	public void setSquad(String squad) {
		this.squad = squad;
	}
	public String getbU() {
		return bU;
	}
	public void setbU(String bU) {
		this.bU = bU;
	}
	public String getAlocation() {
		return alocation;
	}
	public void setAlocation(String alocation) {
		this.alocation = alocation;
	}
	public String getBorrowedTo() {
		return borrowedTo;
	}
	public void setBorrowedTo(String borrowedTo) {
		this.borrowedTo = borrowedTo;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getOldEmail() {
		return oldEmail;
	}
	public void setOldEmail(String oldEmail) {
		this.oldEmail = oldEmail;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}

}
