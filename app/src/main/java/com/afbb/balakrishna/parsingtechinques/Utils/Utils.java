package com.afbb.balakrishna.parsingtechinques.Utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by balakrishna on 3/7/15.
 */
public class Utils {
    private static Utils instance;

    public static Utils getInstance() {
        if (instance == null)
            instance = new Utils();
        return instance;
    }


    public String readFile(Context context, String filename) {
        try {
            InputStream inputStream = context.getAssets().open(filename);
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            inputStream.close();
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "No input";
    }
}
