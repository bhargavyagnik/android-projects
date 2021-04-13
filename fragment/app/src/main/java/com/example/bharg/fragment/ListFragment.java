package com.example.bharg.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends android.support.v4.app.ListFragment {

    Itemselected activity;
    public interface Itemselected{
        void onItemselected(int index);
    }

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (Itemselected)context;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<String> data = new ArrayList<>();
        data.add("1.This is Item 1");
        data.add("2. This is item 2");
        data.add("This is item 3");

        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data));
        activity.onItemselected(0);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        activity.onItemselected(position);
    }
}
