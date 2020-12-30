package io.jobapplication.springboot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class IPAddress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String syncToken;
	private String createDate;
	private List<Prefixe> prefixes;
	
	public IPAddress() {
		this.prefixes = new ArrayList<>();
	}
	

	public List<Prefixe> getPrefixes() {
		return prefixes;
	}

	public void setPrefixes(List<Prefixe> prefixes) {
		this.prefixes = prefixes;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getSyncToken() {
		return syncToken;
	}

	public void setSyncToken(String syncToken) {
		this.syncToken = syncToken;
	}
}
