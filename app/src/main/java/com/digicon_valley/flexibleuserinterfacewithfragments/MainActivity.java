package com.digicon_valley.flexibleuserinterfacewithfragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {

        FragmentManager manager=getSupportFragmentManager();
        FragmentB f2=(FragmentB) manager.findFragmentById(R.id.fragment_b);
        f2.changeData(i);


    }
}
