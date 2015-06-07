package capstone.coursera.nanofaroque.com.retrofitsimplegettesting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ofaro on 6/1/2015.
 */
public class Weather {
    @SerializedName("id")
    String id;
    @SerializedName("main")
    String main;
    @SerializedName("description")
    String description;
    @SerializedName("icon")
    String icon;

    public String getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

}
