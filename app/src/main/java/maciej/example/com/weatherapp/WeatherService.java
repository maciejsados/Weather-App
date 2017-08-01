package maciej.example.com.weatherapp;

import java.io.IOException;
import java.util.List;


import maciej.example.com.weatherapp.model.Main;
import maciej.example.com.weatherapp.model.Weather;
import retrofit2.Call;
import retrofit2.Response;



public class WeatherService {

    private final WeatherApiClient weatherApiClient;


    public WeatherService() {
        weatherApiClient = new WeatherApiClientFactory().createWeatherApiClient();

    }

    public List<Weather> getWeather() throws IOException {
        Call<WeatherResponse> call = weatherApiClient.getWeather();
        Response<WeatherResponse> response = call.execute();
        return response.body().getWeather();
    }
}



