package com.test.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Create {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Task11 a = new Task11();
		a.disable();
		try {
			URL url = new URL("https://localhost:8443/rest/ProductService/v1/product");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Authorization", "Bearer cd8f3dae-98c5-4f0b-b56a-2f279c7e3068");
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			String jsonPayload = "{\"categoryCode\":\"CAT2\",\"description\":\"Rest Create \",\"name\":\"NewApi1\",\"pricePlanInfos\":[{\"description\":\"Rest Create Product with override settlement rule plan 01\",\"name\":\"plannew\",\"pricePlanEventInfos\":[{\"chargeInfos\":[{\"amount\":\"100\",\"chargeMode\":\"1\",\"currencyCode\":\"840\",\"cost\":10}],\"feeType\":\"5\"}]}]}";
			connection.setDoOutput(true);
			connection.getOutputStream().write(jsonPayload.getBytes());
			int responseCode = connection.getResponseCode();
			System.out.println("Response Code: " + responseCode);
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			StringBuilder response = new StringBuilder();

			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			reader.close();
			connection.disconnect();
			System.out.println("Response Data: " + response.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
