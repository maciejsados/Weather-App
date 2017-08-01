package maciej.example.com.weatherapp;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.List;

import maciej.example.com.weatherapp.model.Main;
import maciej.example.com.weatherapp.model.Weather;


public class GetWeatherAsyncTask extends AsyncTask<Void, Void, List<Weather>> {

    private final WeatherService weatherService;
    private final WeatherDownloadedListener weatherDownloadedListener;

    public GetWeatherAsyncTask(WeatherDownloadedListener weatherDownloadedListener) {
        weatherService = new WeatherService();
        this.weatherDownloadedListener = weatherDownloadedListener;
    }

    @Override
    protected List<Weather> doInBackground(Void... voids) {
        try {
            return weatherService.getWeather();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(List<Weather> weathers) {
        weatherDownloadedListener.onWeatherDownloaded(weathers);
    }

    public interface WeatherDownloadedListener {
        void onWeatherDownloaded(List<Weather> weather);
    }
}
