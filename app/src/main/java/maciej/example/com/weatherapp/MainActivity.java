package maciej.example.com.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import maciej.example.com.weatherapp.model.Main;
import maciej.example.com.weatherapp.model.Weather;


public class MainActivity extends AppCompatActivity implements GetWeatherAsyncTask.WeatherDownloadedListener {

    @BindView(R.id.recycler_weatcher_items)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        new GetWeatherAsyncTask(this).execute();


    }

    @OnClick(R.id.button)
    public void refresh() {
        new GetWeatherAsyncTask(this).execute();
    }


    @Override
    public void onWeatherDownloaded(List<Weather> weather) {

        if (weather == null) {
            Toast.makeText(this, "FAILED", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Downloaded: " + weather.size(), Toast.LENGTH_SHORT).show();

        WeatherRecyclerAdapter adapter = new WeatherRecyclerAdapter(this, weather);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}




