package com.tkonstantopoulos.weatherviewer.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.tkonstantopoulos.weatherviewer.R;
import com.tkonstantopoulos.weatherviewer.data.WeatherItem;

import java.util.ArrayList;

public class WeatherItemAdapter implements ListAdapter {

    ArrayList<WeatherItem> arrayList;
    Context context;

    public WeatherItemAdapter(ArrayList<WeatherItem> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        WeatherItem weatherItem = arrayList.get(i);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.list_rain, null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        TextView weatherHeader = view.findViewById(R.id.weatherItemHeader);
        ImageView imageView = view.findViewById(R.id.weatherItemImage);
        TextView lowTemp = view.findViewById(R.id.lowTemp);
        TextView highTemp = view.findViewById(R.id.highTemp);
        TextView humidityPercentage = view.findViewById(R.id.humidityPercentage);

        weatherHeader.setText(weatherItem.getHeader());
        imageView.setImageResource(
                weatherItem.getMsgForDay().contains("clear") ? R.mipmap.ic_weather_sunny : R.mipmap.ic_weather_rain
        );
        lowTemp.setText(String.format("Low: %d℉", weatherItem.getLow()));
        highTemp.setText(String.format("High: %d℉", weatherItem.getHigh()));
        humidityPercentage.setText(String.format("Humidity: %d%%", weatherItem.getHumidity()));
        return view;
    }

    @Override
    public int getItemViewType(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
