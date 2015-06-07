package capstone.coursera.nanofaroque.com.retrofitsimplegettesting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ofaro on 6/1/2015.
 */
public class Wind {
    @SerializedName("speed")
    String speed;
    @SerializedName("deg")
    String deg;

    public String getSpeed() {
        return speed;
    }

    public String getDeg() {
        return deg;
    }

}
