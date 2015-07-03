package com.afbb.balakrishna.parsingtechinques.Json;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParse {

    public void jsonParsing(String jsondata) {
        Log.d("JsonParse", "jsonParsing 12 " + jsondata);
        try {
            JSONObject jsonRootObject = new JSONObject(jsondata);
            JSONObject sys = jsonRootObject.getJSONObject("sys");
            String country = sys.getString("country");
            String sunrise = sys.getString("sunrise");
            Log.d("JsonParse", "jsonParsing 18 Obj: country: " + country + "  sunrise:" + sunrise);
            JSONArray jsonArray = jsonRootObject.getJSONArray("weather");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject o = (JSONObject) jsonArray.get(i);
                String main = o.getString("main");
                Log.d("JsonParse", "jsonParsing 20 ARRAY DATA:  " + main);

            }

        } catch (JSONException e) {
            Log.d("JsonParse", "jsonParsing 27 " + e.getMessage());
            e.printStackTrace();
        }
    }
}
