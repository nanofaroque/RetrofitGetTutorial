package capstone.coursera.nanofaroque.com.retrofitsimplegettesting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ofaro on 6/1/2015.
 */
public class Cordinate {
    @SerializedName("lat")
    String lat;
    @SerializedName("lon")
    String lon;

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}
