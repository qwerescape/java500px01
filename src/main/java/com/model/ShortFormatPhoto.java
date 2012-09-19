package com.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ShortFormatPhoto {
	private String id;

	public ShortFormatPhoto(){}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
