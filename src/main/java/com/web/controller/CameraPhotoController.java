package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CameraPhotoController {
	
	@RequestMapping(value="/")
	public ModelAndView getCameraAndPhotoView(){
		return new ModelAndView("camera-photo");
	}
}
