package com.awslab.portfolioapp.team;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.renderscript.Element;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.awslab.portfolioapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeamFragment extends Fragment {


    RecyclerView RvTeam;
    TeamAdapter adapter;
    List<TeamItem> mdata;

    public TeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RvTeam = view.findViewById(R.id.rv_team);

        // create list of team items

        TeamItem project1 = new TeamItem("Speech Recognition",getString(R.string.project1),R.drawable.project);
        TeamItem project2 = new TeamItem("Fish Classification",getString(R.string.project2),R.drawable.project);
        TeamItem project3 = new TeamItem("Recommendation Search App",getString(R.string.project3),R.drawable.project);
        TeamItem project4 = new TeamItem("Speech to Speech Translation",getString(R.string.project4),R.drawable.project);
        TeamItem project5 = new TeamItem("Portfolio Website",getString(R.string.project5),R.drawable.project);

        mdata = new ArrayList<>();
        mdata.add(project1);
        mdata.add(project2);
        mdata.add(project3);
        mdata.add(project4);
        mdata.add(project5);


        // setup adapter and recyclerview

        RvTeam.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TeamAdapter(mdata);
        RvTeam.setAdapter(adapter);




    }
}
