package com.qa.lms.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

 public class SeleniumComponents 
{

public static void fileUpload(String strFileUpload) throws AWTException, InterruptedException
{
	StringSelection sel = new StringSelection(strFileUpload);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	Robot robot = new Robot();
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(1000); 
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	 
}

public static void updateTestRailResultAsPass(String testCaseId) 
{
String payload = "{\"status_id\":\"1\"}";
String requestUrl = "https://auzmorhr.testrail.io/index.php?/api/v2/add_result/" + testCaseId;
sendPostRequest(requestUrl, payload);
}

public static void updateTestRailResultAsFail(String testCaseId) 
{
String payload = "{\"status_id\":\"5\"}";
String requestUrl = "https://auzmorhr.testrail.io/index.php?/api/v2/add_result/" + testCaseId;
sendPostRequest(requestUrl, payload);
}

public static String sendPostRequest(String requestUrl, String payload) 
{
try 
{
URL url = new URL(requestUrl);
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setDoInput(true);
connection.setDoOutput(true);
connection.setRequestMethod("POST");
connection.setRequestProperty("Accept", "application/json");
connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
connection.setRequestProperty("Authorization",
"Basic ZGVlcGFrQGFtZXJpY2FuLXRlY2hub2xvZ3kubmV0OnBhc3N3b3Jk");
OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
writer.write(payload);
writer.close();
BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
StringBuffer jsonString = new StringBuffer();
String line;
while ((line = br.readLine()) != null) {
jsonString.append(line);
}
br.close();
connection.disconnect();
return jsonString.toString();
} catch (Exception e) {
throw new RuntimeException(e.getMessage());
}

}



}
