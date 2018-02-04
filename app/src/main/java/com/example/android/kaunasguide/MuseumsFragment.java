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
    public class MuseumsFragment extends Fragment {

        public MuseumsFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.location_list, container, false);

            // Create a list of locations
            final ArrayList<Location> locations = new ArrayList<Location>();
            locations.add(new Location(R.string.kaunas_castle,R.string.castle_description,R.drawable.kaunas_castle));
            locations.add(new Location(R.string.kaunas_town_hall,R.string.hall_description,R.drawable.kaunas_town_hall));
            locations.add(new Location(R.string.IX_fort_museum, R.string.fort_description, R.drawable.fortas_museum));
            locations.add(new Location(R.string.pazaislis_monastery, R.string.pazaislis_description,R.drawable.pazaislis_monastery));
            locations.add(new Location(R.string.aviation_museum, R.string.aviation_description,R.drawable.aviation_museum));
            locations.add(new Location(R.string.war_museum, R.string.war_description,R.drawable.war_museum));
            locations.add(new Location(R.string.ciurlionis_museum, R.string.ciurlionis_description,R.drawable.ciurlionis_museum));


            // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
            // adapter knows how to create list items for each item in the list.
            LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_museums);

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