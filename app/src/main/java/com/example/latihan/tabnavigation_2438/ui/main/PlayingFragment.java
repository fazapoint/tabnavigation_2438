package com.example.latihan.tabnavigation_2438.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihan.tabnavigation_2438.Movie;
import com.example.latihan.tabnavigation_2438.MovieAdapter;
import com.example.latihan.tabnavigation_2438.R;

import java.util.ArrayList;


public class PlayingFragment extends Fragment {

    private String[] movie = {
            "Bad Boys",
            "The Old Guard",
            "Raised by Wolves",
            "Elite",
            "The Walking Dead",
            "Artemis Fowl",
            "Black Box",
            "Riverdale",
            "Law Order",
            "Scary Movie",
            "Star Trek",
            "Hubie Hallowen",
            "Distric 9",
            "The Hurricane",
            "Paddington 2",
            "Pride and Prejudice"
    };

    private String[] movieYear = {
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001",
            "2001"
    };

    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_playing, container, false);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length; i++){
            Movie mov = new Movie(movie[i],movieYear[i]);
            listMovie.add(mov);
        }

        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        rvMovie.setLayoutManager(new LinearLayoutManager(getContext()));

        MovieAdapter movieAdapter = new MovieAdapter(listMovie);
        rvMovie.setAdapter(movieAdapter);

        return view;
    }
}