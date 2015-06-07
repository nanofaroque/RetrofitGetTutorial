package capstone.coursera.nanofaroque.com.retrofitsimplegettesting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ofaro on 6/1/2015.
 */
public class ResponseData {
    @SerializedName("coord")
    Cordinate cordinate;
    @SerializedName("sys")
    System sys;
    // @SerializedName(“weather”)
//Weather weather;
    @SerializedName("main")
    Main main;
    @SerializedName("base")
    String base;
    @SerializedName("dt")
    String dt;
    @SerializedName("id")
    String id;
    @SerializedName("name")
    String cityName;
    @SerializedName("cod")
    String cod;
    @SerializedName("wind")
    Wind wind;

    @SerializedName("weather")
    Weather[] weathers;
    @SerializedName("clouds")
    Clouds clouds;

    public Weather[] getWeathers() {
        return weathers;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public Cordinate getCordinate() {
        return cordinate;
    }

    public System getSys() {
        return sys;
    }

    public Main getMain() {
        return main;
    }

    public String getBase() {
        return base;
    }

    public String getDt() {
        return dt;
    }

    public String getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCod() {
        return cod;
    }
}
