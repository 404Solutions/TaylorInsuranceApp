package com.example.user.taylorinsuranceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home_quote:
                setContentView(R.layout.home_quote);
                return true;
            case R.id.home_policy:
                setContentView(R.layout.home_policy);
                return true;
            case R.id.vehicle_quote:
                setContentView(R.layout.vehicle_quote);
                return true;
            case R.id.vehicle_policy:
                setContentView(R.layout.vehicle_policy);
                return true;
            case R.id.secondary_driver:
                setContentView(R.layout.second_driver);
                return true;
            case R.id.vehicle_info:
                setContentView(R.layout.vehicle_info);
                return true;
            case R.id.home_info:
                setContentView(R.layout.home_info);
                return true;
            case R.id.user_info:
                setContentView(R.layout.user_info);
                return true;
            case R.id.contact_us:
                setContentView(R.layout.activity_main);
                return true;
            case R.id.sign_out:
                setContentView(R.layout.activity_main);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
