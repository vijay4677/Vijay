package com.test.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CreateTokenApi {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	  Task11 a=new Task11();
	  a.disable();
	  try {
		  URL url =new URL("https://localhost:8443/oauth/token?grant_type=password&client_id=vijay1&client_secret=vijay1&username=vijay1&password=ce944500d9aa0e547d9e7f152fbe83a2911ea7221fa3887d4637d6912b0b74fd&scope=trust");
		  HttpURLConnection con =(HttpURLConnection)url.openConnection();
		  con.setRequestMethod("POST");
		  int responseCode = con.getResponseCode();
          System.out.println("Response Code: " + responseCode);
          BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
       String line;
       StringBuilder response = new StringBuilder();

        while ((line = reader.readLine()) != null) {
           response.append(line);           reader.close();     con.disconnect();

              System.out.println("Response Data: " + response.toString());
	  }
	
}
	  catch (Exception e) {
		// TODO: handle exception
		  System.out.println("exception");
	}
}}
