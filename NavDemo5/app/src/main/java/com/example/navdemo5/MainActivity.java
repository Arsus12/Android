package com.example.navdemo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.navdemo5.ui.main.MainFragment;

import android.net.Uri;

public class MainActivity extends AppCompatActivity implements
        SecondFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}
