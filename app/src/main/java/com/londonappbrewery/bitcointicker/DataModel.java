package com.londonappbrewery.bitcointicker;

import android.provider.ContactsContract;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Admin on 02.10.2017.
 */

public class DataModel {

    private String mPrice;


    public static DataModel fromJson(JSONObject jsonObject) {

        try {
            DataModel model = new DataModel();

            model.mPrice = jsonObject.getString("last");

            return model;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;

        }

    }

    public String getPrice() {
        return mPrice;
    }



}
