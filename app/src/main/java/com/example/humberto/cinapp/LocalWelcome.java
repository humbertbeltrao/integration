package com.example.humberto.cinapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LocalWelcome extends AppCompatActivity {
    TextView nomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.nomeTextView = (TextView) findViewById(R.id.textView);
        String msg = String.format("Hello %s how are you doing?", MainActivity.name.getText().toString());
        nomeTextView.setText(msg);


    }







}


