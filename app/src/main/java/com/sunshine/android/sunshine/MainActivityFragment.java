package com.sunshine.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String data[] = {"Today-Sunny-88/63","Today-Sunny-88/63","Today-Sunny-88/63","Today-Sunny-88/63","Today-Sunny-88/63",
                "Today-Sunny-88/63","Today-Sunny-88/63"};
        List<String> forecastArray = new ArrayList<String>(Arrays.asList(data));

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String> (getActivity(),R.layout.list_item_forecast,
                R.id.list_item_forecast_textview, forecastArray);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView weatherList = (ListView) rootView.findViewById(R.id.listview_forecast);

        weatherList.setAdapter(forecastAdapter);

        return rootView;

    }
}
