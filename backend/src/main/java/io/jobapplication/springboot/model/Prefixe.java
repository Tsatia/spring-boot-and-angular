package io.jobapplication.springboot.model;


public class Prefixe{

	private String ip_prefix;
	private String region;
	private String service;
	private String network_border_group;
	
	

	public String getIp_prefix() {
		return ip_prefix;
	}
	public void setIp_prefix(String ip_prefix) {
		this.ip_prefix = ip_prefix;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getNetwork_border_group() {
		return network_border_group;
	}
	public void setNetwork_border_group(String network_border_group) {
		this.network_border_group = network_border_group;
	}
}
