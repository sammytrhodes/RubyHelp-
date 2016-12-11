package com.example.alex.mapsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void launchAddBook(View view) {
        //CREATE AN INTENT TO DISPLAY THE ADD BOOK ACTIVITY
        Intent launchAddBook = new Intent(this, MapsActivity.class);
        //START THE ADD BOOK ACTIVITY
        startActivity(launchAddBook);
    }



}
