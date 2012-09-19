package com.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LongFormatPhoto {
	String id;
	String image_url;
	String camera; //using string for now
	String lens;
	
	public LongFormatPhoto(){}
	
	public String getId() {
		return id;
	}
	public String getImage_url() {
		return image_url;
	}
	public String getCamera() {
		return camera;
	}
	public String getLens() {
		return lens;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}
}
