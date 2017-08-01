package maciej.example.com.weatherapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import maciej.example.com.weatherapp.model.Main;
import maciej.example.com.weatherapp.model.Weather;

public class WeatherResponse {


    private final List<Weather> weather;


    public WeatherResponse(List<Weather> weather) {
        this.weather = weather;
    }

    public List<Weather> getWeather() {
        return weather;
    }
}

