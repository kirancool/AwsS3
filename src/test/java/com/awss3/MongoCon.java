package com.awss3;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
/*
import com.awss3.common.Helper;
import com.awss3.entity.Datasource;
import com.awss3.excutore.ExecContext;*/
import com.awss3.service.CommonServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;

public class MongoCon {
/*	@Autowired
	static
	CommonServiceImpl commonServiceImpl;
	public static void main(String args[]) throws ClassNotFoundException, SQLException, JsonProcessingException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NullPointerException, ParseException
	{
		Datasource ds=null;
		Class.forName(ds.getDriver());
		Connection con = null;
       
        	con = DriverManager.getConnection(Helper.genUrlByDatasource(ds) + "?useSSL=false", ds.getUsername(), ds.getPassword());
    	
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from framework_edw.bank");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		
	}
*/
}
