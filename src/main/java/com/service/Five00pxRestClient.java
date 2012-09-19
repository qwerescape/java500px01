package com.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.model.LongFormatPhoto;
import com.model.ShortFormatPhoto;

import web.bean.OnePhotoJsonResult;
import web.bean.PhotosJsonResultWrapper;

@Service
public class Five00pxRestClient {
	//hard coded urls here, should externalize
	String manyPhotoUrl; 
	String onePhotoUrl;
	String consumerKey; 
	RestTemplate restTemplate;
	public Five00pxRestClient(){
		manyPhotoUrl = "https://api.500px.com/v1/photos?feature=editors&rpp=100&sort=favorites_count&consumer_key=";
		onePhotoUrl = "https://api.500px.com/v1/photos/";
		consumerKey = "....";//get your own from 500px;
		restTemplate = new RestTemplate();
		
	}
	public List<ShortFormatPhoto> retrieveShortFormatPhotos() throws JsonParseException, JsonMappingException, IOException{
		PhotosJsonResultWrapper jsonResult = restTemplate.getForObject(manyPhotoUrl+consumerKey, PhotosJsonResultWrapper.class);
		return jsonResult.getPhotos();
	}
	
	public List<LongFormatPhoto> retrieveLongPhotosGivenShortPhotos(List<ShortFormatPhoto> shortFormatPhotoList) throws JsonParseException, JsonMappingException, IOException{
		List<LongFormatPhoto> result = new ArrayList<LongFormatPhoto>();
		for (ShortFormatPhoto sfp : shortFormatPhotoList){
			OnePhotoJsonResult photoJson = restTemplate.getForObject(onePhotoUrl+sfp.getId()+"?image_size=3&consumer_key="+consumerKey, OnePhotoJsonResult.class);
			LongFormatPhoto p = photoJson.getPhoto();
			if (p != null && p.getCamera() != null && p.getCamera().trim().length() > 0){
				//has a camera;
				result.add(p);
			}
		}
		return result;
	}
}
