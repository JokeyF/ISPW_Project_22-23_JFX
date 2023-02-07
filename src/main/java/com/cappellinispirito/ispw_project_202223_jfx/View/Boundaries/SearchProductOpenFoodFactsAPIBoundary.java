package com.cappellinispirito.ispw_project_202223_jfx.View.Boundaries;

import com.cappellinispirito.ispw_project_202223_jfx.Controller.SearchProductController;
import com.cappellinispirito.ispw_project_202223_jfx.Controller.SingletonInstance;
import com.cappellinispirito.ispw_project_202223_jfx.Model.beansInterface.productJSONBean;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

public class SearchProductOpenFoodFactsAPIBoundary implements SingletonInstance {
    private SingletonInstance instance;

    @Override
    public SingletonInstance getInstance() {
        if(instance==null){
            instance = new SearchProductController();
        }
        return instance;
    }

    public void findProductByName(String searchName, productJSONBean bean2) throws IOException, ParseException {
        HashMap<String, String> nameToBarcode = new HashMap<>();

        CloseableHttpClient httpClient = HttpClients.createDefault();
        JSONParser parser = new JSONParser();
        // Send a GET request to the API
        HttpGet request = new HttpGet("https://world.openfoodfacts.org/api/v0/search.json?search_terms=" + searchName);
        CloseableHttpResponse response = httpClient.execute(request);

        // Read the response
        String json = EntityUtils.toString(response.getEntity());

        // Parse the JSON response
        JSONObject obj = (JSONObject) parser.parse(json);
        JSONArray products = (JSONArray) obj.get("products");

        // Convert the products array to a list of Product objects
        for (Object product : products) {
            JSONObject productData = (JSONObject) product;
            String barcode = (String) productData.get("code");
            String productName = (String) productData.get("product_name");
            nameToBarcode.put(productName,barcode);
        }

        bean2.setMap(nameToBarcode);
    }
}