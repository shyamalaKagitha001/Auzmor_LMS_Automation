package com.qa.lms.util;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONComponent
{
public static JSONObject GetData(String strDataElementName)
{
	try
	{
		JSONObject joJSONFileData = (JSONObject) new JSONParser().parse(new FileReader(System.getProperty("user.dir") + "//src//main//java//com//qa"+ "//lms//testdata//testdata.json"));
		JSONObject joTestData = (JSONObject) joJSONFileData.get(strDataElementName);
		return joTestData;
				
		
	}
	
	catch(Exception e)
	{
		return null;
	}
}
}
