package maciej.example.com.weatherapp;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;



public class WeatherViewHolder extends RecyclerView.ViewHolder {


public final TextView textView1;
    public final TextView textView2;
    public  final TextView textView3;



    public WeatherViewHolder(View itemView) {
        super(itemView);
        this.textView1 = (TextView) itemView.findViewById(R.id.view1);
        this.textView2 = (TextView) itemView.findViewById(R.id.view2);
        this.textView3 = (TextView) itemView.findViewById(R.id.view3);
    }
}
