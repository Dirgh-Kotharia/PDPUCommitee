package com.app.pdpu.pdpucommitee.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.pdpu.pdpucommitee.Adapter.RecyclerViewAdapter;
import com.app.pdpu.pdpucommitee.R;
import com.app.pdpu.pdpucommitee.Util.ListCommitee;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private List<ListCommitee> commiteeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.listCommitee);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        commiteeList = new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            ListCommitee commitee = new ListCommitee("Commitee"+(i+1),"Description of "+(i+1) );
            commiteeList.add(commitee);
        }

        recyclerViewAdapter = new RecyclerViewAdapter(this,commiteeList);

        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
