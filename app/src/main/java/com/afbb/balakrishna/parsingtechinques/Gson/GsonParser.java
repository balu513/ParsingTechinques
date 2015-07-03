package com.afbb.balakrishna.parsingtechinques.Gson;

import android.util.Log;

import com.google.gson.GsonBuilder;

public class GsonParser {

    public void parseData(String data) {
        Subject[] subjects = new GsonBuilder().create().fromJson(data, Subject[].class);
        Log.d("GsonParser", "parseData 9 " + subjects);

        /**
         * for single Json object.
         */
        //Subject subject = new GsonBuilder().create().fromJson(data, Subject.class);
        //Log.d("GsonParser", "parseData 9 " +subject);
    }
}
