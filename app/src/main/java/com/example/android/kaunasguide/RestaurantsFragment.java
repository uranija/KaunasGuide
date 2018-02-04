package com.example.android.kaunasguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

    /**
     * {@link Fragment} that displays a list of number vocabulary words.
     */
    public class RestaurantsFragment extends Fragment {

        public RestaurantsFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.location_list, container, false);

            // Create a list of locations
            final ArrayList<Location> locations = new ArrayList<Location>();
            locations.add(new Location(R.string.bajorkiemis,R.string.bajorkiemis_description,R.drawable.bajorkiemis));
            locations.add(new Location(R.string.kaimas,R.string.kaimas_description,R.drawable.kaimas));
            locations.add(new Location(R.string.smukle, R.string.smukle_description, R.drawable.smukle));
            locations.add(new Location(R.string.stenlis, R.string.stenlis_description,R.drawable.stenlis));
            locations.add(new Location(R.string.vartai, R.string.vartai_description,R.drawable.vartai));

            // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
            // adapter knows how to create list items for each item in the list.
            LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_restaurants);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // location_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Location} in the list.
            listView.setAdapter(adapter);

            return rootView;
        }
    }