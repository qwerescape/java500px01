package com.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Five00pxRestClient {
	//hard coded urls here, should externalize
	String url500pxRestAPI; 
	String consumerKey; 
	RestTemplate restTemplate;
	public Five00pxRestClient(){
		url500pxRestAPI = "https://api.500px.com/v1/photos?feature=editors&rpp=100&sort=favorites_count&consumer_key=";
		consumerKey = "RBxyyAJaspl3Lio0aEjvf4FUWBIRhziJ43rvBzFv";
		restTemplate = new RestTemplate();
		
	}
	public String retrievePhotosFrom500pxThroughRest(){
		String result = restTemplate.getForObject(url500pxRestAPI+consumerKey, String.class);
		return result;
	}
}
