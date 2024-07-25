package com.test1;

public class ServiceDeskData {
	private String changeManagementCode;
	private String changeManagementName;
	private String localenvironment;
	private String tradeenvironment;
	private String shortDescription;
	private String multiServiceDeskOption;
	private String changeManagementParams;
	private Integer uploadVersion;
	private String launchEnvironment;
	private String manageEnvironment;
	private String status;

	public ServiceDeskData() {

	}

	public ServiceDeskData(String changeManagementCode, String changeManagementName, String localenvironment,
			String tradeenvironment, String shortDescription, String multiServiceDeskOption,
			String changeManagementParams, Integer uploadVersion, String launchEnvironment, String manageEnvironment,
			String status) {
		super();
		this.changeManagementCode = changeManagementCode;
		this.changeManagementName = changeManagementName;
		this.localenvironment = localenvironment;
		this.tradeenvironment = tradeenvironment;
		this.shortDescription = shortDescription;
		this.multiServiceDeskOption = multiServiceDeskOption;
		this.changeManagementParams = changeManagementParams;
		this.uploadVersion = uploadVersion;
		this.launchEnvironment = launchEnvironment;
		this.manageEnvironment = manageEnvironment;
		this.status = status;
	}

	public String getChangeManagementCode() {
		return changeManagementCode;
	}

	public void setChangeManagementCode(String changeManagementCode) {
		this.changeManagementCode = changeManagementCode;
	}

	public String getChangeManagementName() {
		return changeManagementName;
	}

	public void setChangeManagementName(String changeManagementName) {
		this.changeManagementName = changeManagementName;
	}

	public String getLocalenvironment() {
		return localenvironment;
	}

	public void setLocalenvironment(String localenvironment) {
		this.localenvironment = localenvironment;
	}

	public String getTradeenvironment() {
		return tradeenvironment;
	}

	public void setTradeenvironment(String tradeenvironment) {
		this.tradeenvironment = tradeenvironment;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getMultiServiceDeskOption() {
		return multiServiceDeskOption;
	}

	public void setMultiServiceDeskOption(String multiServiceDeskOption) {
		this.multiServiceDeskOption = multiServiceDeskOption;
	}

	public String getChangeManagementParams() {
		return changeManagementParams;
	}

	public void setChangeManagementParams(String changeManagementParams) {
		this.changeManagementParams = changeManagementParams;
	}

	public Integer getUploadVersion() {
		return uploadVersion;
	}

	public void setUploadVersion(Integer uploadVersion) {
		this.uploadVersion = uploadVersion;
	}

	public String getLaunchEnvironment() {
		return launchEnvironment;
	}

	public void setLaunchEnvironment(String launchEnvironment) {
		this.launchEnvironment = launchEnvironment;
	}

	public String getManageEnvironment() {
		return manageEnvironment;
	}

	public void setManageEnvironment(String manageEnvironment) {
		this.manageEnvironment = manageEnvironment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
