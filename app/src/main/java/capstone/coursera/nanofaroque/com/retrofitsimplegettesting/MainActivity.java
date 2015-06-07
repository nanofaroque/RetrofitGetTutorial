package capstone.coursera.nanofaroque.com.retrofitsimplegettesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Date;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    String BASE_URL="http://api.openweathermap.org";

    TextView tvCityName,tvSpeed,tvDeg,tvTemp,tvHumidity,tvSunrise,tvSunset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCityName=(TextView)findViewById(R.id.tv_city_name);
        tvSpeed=(TextView)findViewById(R.id.speed);
        tvDeg=(TextView)findViewById(R.id.deg);
        tvTemp=(TextView)findViewById(R.id.temp);
        tvHumidity=(TextView)findViewById(R.id.humidity);
        tvSunrise=(TextView)findViewById(R.id.sunrise);
        tvSunset=(TextView)findViewById(R.id.sunset);

        RestAdapter restAdapter=new RestAdapter.Builder().setEndpoint(BASE_URL).build();
        ApiInterface apiInterface=restAdapter.create(ApiInterface.class);

        Callback callback=new Callback() {
            @Override
            public void success(Object o, Response response) {
                ResponseData responseData= (ResponseData) o;
                Log.d("Result:",responseData.getCityName().toString());
                tvCityName.setText("City:"+responseData.getCityName());
                tvSpeed.setText("Speed:"+responseData.getWind().getSpeed());
                tvTemp.setText("Temperature:"+responseData.getMain().getTemp());
                tvHumidity.setText("Humidity"+responseData.getMain().getHumidity());
                tvSunrise.setText("Sunrise:"+new Date(Long.parseLong(responseData.getSys().getSunrise())*1000));
                tvSunset.setText("Sunset:"+new Date(Long.parseLong(responseData.getSys().getSunset())*1000));
                tvDeg.setText("Degree:"+responseData.getWind().getDeg());
            }

            @Override
            public void failure(RetrofitError error) {

            }
        };
        apiInterface.getWeather("chicago",callback);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
