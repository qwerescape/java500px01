package com.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.model.Gear;
import com.model.LongFormatPhoto;
import com.model.ShortFormatPhoto;
import com.service.Five00pxRestClient;

@Controller
public class CameraPhotoController {
	@Autowired
	Five00pxRestClient client;
	@RequestMapping(value="/photos")
	public ModelAndView getCameraAndPhotoView() throws JsonParseException, JsonMappingException, IOException{
//		List<ShortFormatPhoto> shortFormatPhotos = client.retrieveShortFormatPhotos();
//		List<LongFormatPhoto> longFormatPhotos = client.retrieveLongPhotosGivenShortPhotos(shortFormatPhotos);
//		//create a list of camera based photos urls
//		Map<Gear, List<String>> gearPhotosMap = new HashMap<Gear, List<String>>();
//		for (LongFormatPhoto lfp : longFormatPhotos){
//			Gear g = new Gear(lfp.getCamera(), lfp.getLens(), 0);
//			if (!gearPhotosMap.containsKey(g)){
//				gearPhotosMap.put(g, Arrays.asList(lfp.getImage_url()));
//			}else{
//				List<String> currentList = gearPhotosMap.get(g);
//				List<String> newList = new ArrayList<String>(currentList);
//				newList.add(lfp.getImage_url());
//				gearPhotosMap.put(g, newList);
//			}
//		}
		return new ModelAndView("camera-photo");//, "gearPhotosMap", gearPhotosMap);
	}
	
	@RequestMapping(value="/photos.json")
	public @ResponseBody List<LongFormatPhoto> getPhotos() throws JsonParseException, JsonMappingException, IOException{
		List<ShortFormatPhoto> shortFormatPhotos = client.retrieveShortFormatPhotos();
		List<LongFormatPhoto> longFormatPhotos = client.retrieveLongPhotosGivenShortPhotos(shortFormatPhotos);
		return longFormatPhotos;
	}
}
