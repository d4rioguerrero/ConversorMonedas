package com.latam.alura;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class CurrencyConverter {
    private static final String API_KEY = "7ee51980d85c176550c43805";

    public double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet("https://v6.exchangerate-api.com/v6/f344a7d30dc96a3420ca5999/latest/USD" + fromCurrency);
            request.addHeader("apikey", API_KEY);
            CloseableHttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();
            String jsonResponse = EntityUtils.toString(entity);

            JSONObject json = new JSONObject(jsonResponse);

            if (json.has("result") && json.getString("result").equals("success")) {
                JSONObject rates = json.getJSONObject("conversion_rates");

                if (rates.has(toCurrency)) {
                    double exchangeRate = rates.getDouble(toCurrency);
                    return amount * exchangeRate;
                } else {
                    System.err.println("La moneda de destino especificada no se encontró en las tasas de conversión.");
                    return 0.0;
                }
            } else {
                System.err.println("Error en la respuesta de la API.");
                return 0.0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}

