package com.example.humberto.cinapp;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.name = (EditText) findViewById(R.id.editText2);
    }

    public void localWelcomeText(View view) {
        if (!(name.getText().toString().equals(""))) {
            Intent intent = new Intent(this, LocalWelcome.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Enter a valid name", Toast.LENGTH_LONG).show();
        }
    }

    public void googleWelcome(View view){
        String q = name.getText().toString();
        Uri uri = Uri.parse("http://www.google.com");
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH, uri);
        intent.putExtra(SearchManager.QUERY, q);
        startActivity(intent);
    }

    public EditText getName() {
        return name;
    }

    public void setName(EditText name) {
        this.name = name;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
