package maciej.example.com.weatherapp;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;



public interface WeatherApiClient {

    @GET("/data/2.5/weather?q=London,uk&APPID=a1483a9ebccb9ae49b6aec6dbeac5963")
    Call<WeatherResponse> getWeather();




}