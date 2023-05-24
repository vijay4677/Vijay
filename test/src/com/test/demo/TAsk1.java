package com.test.demo;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class TAsk1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Task11 a = new Task11();
		a.disable();

		try {
			// Define the URL of the local web server page
			
//		Search the product   ->	URL url = new URL("https://localhost:8443/rest/ProductService/v1/products?searchString=bun&searchBy=categoryName");
			URL url = new URL("https://localhost:8443/rest/InvoiceService/v1/invoices?accountNumber=SR1002&startCount=0&resultCount=2");
			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Authorization","Bearer 75dc0853-c97b-44f1-bb0f-8380e11e0cc0");
			connection.setRequestMethod("GET");

			// Get the response code
			int responseCode = connection.getResponseCode();
			System.out.println("Response Code: " + responseCode);

			// Read the response data
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			StringBuilder response = new StringBuilder();

			while ((line = reader.readLine()) != null) {
				response.append(line);
			}

			// Close the reader and connection
			reader.close();
			connection.disconnect();

			// Print the response data
			System.out.println("Response Data: " + response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
