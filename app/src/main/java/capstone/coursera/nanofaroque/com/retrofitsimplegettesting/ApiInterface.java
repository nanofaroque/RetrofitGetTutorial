package capstone.coursera.nanofaroque.com.retrofitsimplegettesting;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/*
 * Created by ofaro on 6/7/2015.
 */
public interface ApiInterface {
    @GET("/data/2.5/weather")  //
    void getWeather(@Query("q") String city, Callback<ResponseData> callback);
}
