package com.awss3.service;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
/*
import com.awss3.common.Helper;
import com.awss3.entity.Datasource;
import com.awss3.entity.MetaType;
import com.awss3.enums.RunMode;
import com.awss3.excutore.ExecContext;*/
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class CommonServiceImpl {
	/*@Autowired
	Helper helper;
	
	
	public ExecContext getExecContext(RunMode mode) throws JsonProcessingException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NullPointerException, ParseException {
		return helper.getExecutorContext(getDatasourceByApp().getType());
	}
	
	public Datasource getDatasourceByApp() throws JsonProcessingException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NullPointerException, ParseException
			 {
		Datasource datasource = null;
  	datasource = (Datasource) getOneByUuidAndVersionWithoutAppUuid(MetaType.datasource.toString());
		return datasource;
	}
	@SuppressWarnings("unchecked")
	public <T> T getOneByUuidAndVersionWithoutAppUuid(String type)
			throws JsonProcessingException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, NullPointerException, ParseException {
		MetaType metaType = Helper.getMetaType(type);
		
	
		return (T) Helper.getMetaType(type);
	} */
	
}
