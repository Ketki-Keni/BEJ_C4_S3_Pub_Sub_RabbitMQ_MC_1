package com.bej.config;

import org.json.simple.JSONObject;

public class TrackDTO {

    private JSONObject jsonObject;

   public TrackDTO() {    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
