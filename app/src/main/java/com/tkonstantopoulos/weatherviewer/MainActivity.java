package com.tkonstantopoulos.weatherviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import com.tkonstantopoulos.weatherviewer.adapters.WeatherItemAdapter;
import com.tkonstantopoulos.weatherviewer.data.WeatherItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        editText.setText("Boston, MA, US");

        ListView listView = findViewById(R.id.listView);
        ArrayList<WeatherItem> arrayList = new ArrayList<>();
        arrayList.add(
                new WeatherItem(
                    "Tuesday",
                        "sky is clear",
                        71,
                        81,
                        67
                )
        );
        arrayList.add(
                new WeatherItem(
                        "Wednesday",
                        "sky is clear",
                        66,
                        79,
                        68
                )
        );
        arrayList.add(
                new WeatherItem(
                        "Thursday",
                        "sky is clear",
                        63,
                        80,
                        69
                )
        );
        arrayList.add(
                new WeatherItem(
                        "Friday",
                        "sky is clear",
                        63,
                        78,
                        71
                )
        );
        arrayList.add(
                new WeatherItem(
                        "Saturday",
                        "moderate rain",
                        68,
                        72,
                        0
                )
        );
        arrayList.add(
                new WeatherItem(
                        "Sunday",
                        "very heavy rain",
                        65,
                        70,
                        0
                )
        );
        arrayList.add(
                new WeatherItem(
                        "Monday",
                        "very heavy rain",
                        58,
                        65,
                        0
                )
        );
        arrayList.add(
                new WeatherItem(
                        "Tuesday",
                        "light rain",
                        58,
                        65,
                        0
                )
        );
        WeatherItemAdapter weatherItemAdapter = new WeatherItemAdapter(arrayList, this);
        listView.setAdapter(weatherItemAdapter);
    }
}
