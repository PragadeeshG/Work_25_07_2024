package com.test1;

public class ServiceDeskPricing {
	private Integer serviceDeskSubscriptionCode;
	private Integer subscriptionTypeCode;
	private String subscriptionTypePricing;
	private String subscriptionTypeCurrency;
	private String gatewayTools;
	private String modeOfPayments;
	private boolean pricingCustomizationAvailable;
	private String customFactor;
	private String basePrice;
	private String maxPrice;
	private String minPrice;
	private String billingAddress;
	private String mailingAddress;
	private String multiRegionSupport;

	public ServiceDeskPricing() {

	}

	public ServiceDeskPricing(Integer serviceDeskSubscriptionCode, Integer subscriptionTypeCode,
			String subscriptionTypePricing, String subscriptionTypeCurrency, String gatewayTools, String modeOfPayments,
			boolean pricingCustomizationAvailable, String customFactor, String basePrice, String maxPrice,
			String minPrice, String billingAddress, String mailingAddress, String multiRegionSupport) {
		super();
		this.serviceDeskSubscriptionCode = serviceDeskSubscriptionCode;
		this.subscriptionTypeCode = subscriptionTypeCode;
		this.subscriptionTypePricing = subscriptionTypePricing;
		this.subscriptionTypeCurrency = subscriptionTypeCurrency;
		this.gatewayTools = gatewayTools;
		this.modeOfPayments = modeOfPayments;
		this.pricingCustomizationAvailable = pricingCustomizationAvailable;
		this.customFactor = customFactor;
		this.basePrice = basePrice;
		this.maxPrice = maxPrice;
		this.minPrice = minPrice;
		this.billingAddress = billingAddress;
		this.mailingAddress = mailingAddress;
		this.multiRegionSupport = multiRegionSupport;
	}

	public Integer getServiceDeskSubscriptionCode() {
		return serviceDeskSubscriptionCode;
	}

	public void setServiceDeskSubscriptionCode(Integer serviceDeskSubscriptionCode) {
		this.serviceDeskSubscriptionCode = serviceDeskSubscriptionCode;
	}

	public Integer getSubscriptionTypeCode() {
		return subscriptionTypeCode;
	}

	public void setSubscriptionTypeCode(Integer subscriptionTypeCode) {
		this.subscriptionTypeCode = subscriptionTypeCode;
	}

	public String getSubscriptionTypePricing() {
		return subscriptionTypePricing;
	}

	public void setSubscriptionTypePricing(String subscriptionTypePricing) {
		this.subscriptionTypePricing = subscriptionTypePricing;
	}

	public String getSubscriptionTypeCurrency() {
		return subscriptionTypeCurrency;
	}

	public void setSubscriptionTypeCurrency(String subscriptionTypeCurrency) {
		this.subscriptionTypeCurrency = subscriptionTypeCurrency;
	}

	public String getGatewayTools() {
		return gatewayTools;
	}

	public void setGatewayTools(String gatewayTools) {
		this.gatewayTools = gatewayTools;
	}

	public String getModeOfPayments() {
		return modeOfPayments;
	}

	public void setModeOfPayments(String modeOfPayments) {
		this.modeOfPayments = modeOfPayments;
	}

	public boolean isPricingCustomizationAvailable() {
		return pricingCustomizationAvailable;
	}

	public void setPricingCustomizationAvailable(boolean pricingCustomizationAvailable) {
		this.pricingCustomizationAvailable = pricingCustomizationAvailable;
	}

	public String getCustomFactor() {
		return customFactor;
	}

	public void setCustomFactor(String customFactor) {
		this.customFactor = customFactor;
	}

	public String getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getMultiRegionSupport() {
		return multiRegionSupport;
	}

	public void setMultiRegionSupport(String multiRegionSupport) {
		this.multiRegionSupport = multiRegionSupport;
	}

}
