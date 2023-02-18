/*
 * Author : Ketki Keni
 * Date : 16-02-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.config;

import com.bej.domain.Track;
import org.json.simple.JSONObject;

public class TrackDTO {
    private JSONObject jsonObject;

    public TrackDTO() {
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
