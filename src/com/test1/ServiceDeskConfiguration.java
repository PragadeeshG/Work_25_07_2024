package com.test1;

public class ServiceDeskConfiguration {
	private Integer configurationId;
	private String configurationOwner;
	private boolean activeAccount;
	private Integer configurationTypeId;
	private String configurationType;
	private String configurationStatus;
	private Integer configurationDescription;
	private Integer serviceTemplate;
	private String applicationPages;
	private Integer tasks;
	private String ticketsInProgress;
	private String ticketStatusList;
	private String ticketValidity;

	public ServiceDeskConfiguration() {

	}

	public ServiceDeskConfiguration(Integer configurationId, String configurationOwner, boolean activeAccount,
			Integer configurationTypeId, String configurationType, String configurationStatus,
			Integer configurationDescription, Integer serviceTemplate, String applicationPages, Integer tasks,
			String ticketsInProgress, String ticketStatusList, String ticketValidity) {
		super();
		this.configurationId = configurationId;
		this.configurationOwner = configurationOwner;
		this.activeAccount = activeAccount;
		this.configurationTypeId = configurationTypeId;
		this.configurationType = configurationType;
		this.configurationStatus = configurationStatus;
		this.configurationDescription = configurationDescription;
		this.serviceTemplate = serviceTemplate;
		this.applicationPages = applicationPages;
		this.tasks = tasks;
		this.ticketsInProgress = ticketsInProgress;
		this.ticketStatusList = ticketStatusList;
		this.ticketValidity = ticketValidity;
	}

	public Integer getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Integer configurationId) {
		this.configurationId = configurationId;
	}

	public String getConfigurationOwner() {
		return configurationOwner;
	}

	public void setConfigurationOwner(String configurationOwner) {
		this.configurationOwner = configurationOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getConfigurationTypeId() {
		return configurationTypeId;
	}

	public void setConfigurationTypeId(Integer configurationTypeId) {
		this.configurationTypeId = configurationTypeId;
	}

	public String getConfigurationType() {
		return configurationType;
	}

	public void setConfigurationType(String configurationType) {
		this.configurationType = configurationType;
	}

	public String getConfigurationStatus() {
		return configurationStatus;
	}

	public void setConfigurationStatus(String configurationStatus) {
		this.configurationStatus = configurationStatus;
	}

	public Integer getConfigurationDescription() {
		return configurationDescription;
	}

	public void setConfigurationDescription(Integer configurationDescription) {
		this.configurationDescription = configurationDescription;
	}

	public Integer getServiceTemplate() {
		return serviceTemplate;
	}

	public void setServiceTemplate(Integer serviceTemplate) {
		this.serviceTemplate = serviceTemplate;
	}

	public String getApplicationPages() {
		return applicationPages;
	}

	public void setApplicationPages(String applicationPages) {
		this.applicationPages = applicationPages;
	}

	public Integer getTasks() {
		return tasks;
	}

	public void setTasks(Integer tasks) {
		this.tasks = tasks;
	}

	public String getTicketsInProgress() {
		return ticketsInProgress;
	}

	public void setTicketsInProgress(String ticketsInProgress) {
		this.ticketsInProgress = ticketsInProgress;
	}

	public String getTicketStatusList() {
		return ticketStatusList;
	}

	public void setTicketStatusList(String ticketStatusList) {
		this.ticketStatusList = ticketStatusList;
	}

	public String getTicketValidity() {
		return ticketValidity;
	}

	public void setTicketValidity(String ticketValidity) {
		this.ticketValidity = ticketValidity;
	}

}
