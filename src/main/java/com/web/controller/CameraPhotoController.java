package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.Five00pxRestClient;

@Controller
public class CameraPhotoController {
	@Autowired
	Five00pxRestClient client;
	@RequestMapping(value="/photos")
	public ModelAndView getCameraAndPhotoView(){
		String result = client.retrievePhotosFrom500pxThroughRest();
		return new ModelAndView("camera-photo", "jsonResult", result);
	}
}
