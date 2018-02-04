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
    public class NightlifeFragment extends Fragment {

        public NightlifeFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.location_list, container, false);

            // Create a list of locations
            final ArrayList<Location> locations = new ArrayList<Location>();
            locations.add(new Location(R.string.blue_orange,R.string.blue_orange_description,R.drawable.blue_orange));
            locations.add(new Location(R.string.basement_barbara,R.string.basement_barbara_description,R.drawable.basement_barbara));
            locations.add(new Location(R.string.republic, R.string.republic_description, R.drawable.republic));
            locations.add(new Location(R.string.gargaras, R.string.gargaras_description,R.drawable.gargaras));
            locations.add(new Location(R.string.dejavu, R.string.dejavu_description,R.drawable.dejavu));
            locations.add(new Location(R.string.lizdas, R.string.lizdas_description,R.drawable.lizdas));

            // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
            // adapter knows how to create list items for each item in the list.
            LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_nightlife);

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