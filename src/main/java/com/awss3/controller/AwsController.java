package com.awss3.controller;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.awss3.service.AwsService;
import com.awss3.service.DatastoreSeriveImpl;

@RestController
@RequestMapping("/awss")
public class AwsController {
	
@Autowired
AwsService awsService;

@Autowired
DatastoreSeriveImpl datastoreServiceImpl;

@RequestMapping(value="/uploadFile",headers = "content-type=multipart/form-data", method=RequestMethod.POST)
public String uploaddata(@RequestParam("file") MultipartFile file) throws IOException
{
	return awsService.uploadfile(file);
	
}

	/*
	 * @RequestMapping(value="/getResult",method=RequestMethod.GET) public
	 * List<Map<String,Object>> getResult(@RequestParam (value="type") String
	 * type,@RequestParam(value = "mode", required = false, defaultValue =
	 * "OFFLINE") String mode) throws IllegalAccessException,
	 * IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
	 * SecurityException, NullPointerException, ParseException, IOException{ {
	 * 
	 * } RunMode runMode = Helper.getExecutionMode(mode);
	 * 
	 * return datastoreServiceImpl.getResult(type,runMode);
	 * 
	 * 
	 * }
	 */
}
	


