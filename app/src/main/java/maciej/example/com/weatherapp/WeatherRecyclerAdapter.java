package maciej.example.com.weatherapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Date;
import java.util.List;


import maciej.example.com.weatherapp.model.Weather;




public class WeatherRecyclerAdapter extends RecyclerView.Adapter<WeatherViewHolder> {

    private final Context context;
    private final List<Weather> weather;
    private final LayoutInflater layoutInflater;

    public WeatherRecyclerAdapter(Context context, List<Weather> weather) {
        this.context = context;
        this.weather = weather;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.weather_view, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {


        Weather weather= this.weather.get(position);
        holder.textView1.setText("ID " + weather.getId());


        holder.textView2.setText("Main " + weather.getMain());
        holder.textView3.setText("Description " + weather.getDescription());


        }



    @Override
    public int getItemCount() {
        return weather.size();
    }
}
