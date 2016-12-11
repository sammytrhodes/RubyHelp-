package com.example.alex.mapsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Alex on 12/4/2016.
 */
public class AddBook extends Activity {

    private EditText titleET;
    private EditText authorET;
    private EditText genreET;
    private String titleStr;
    private String authorStr;
    private String genreStr;
    private double myLongitude;
    private double myLat;

    private int id=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_book);
        Intent bookLocation = getIntent();
        //retrieves data from an intent in main
        myLongitude = bookLocation.getDoubleExtra("LongPoint", 0.0);
        myLat = bookLocation.getDoubleExtra("LatPoint", 0.0);

        titleET =(EditText)findViewById(R.id.titleET);
        authorET =(EditText)findViewById(R.id.AuthorET);
        genreET =(EditText)findViewById(R.id.GenreET);

        titleStr=titleET.toString();
        authorStr=authorET.toString();
        genreStr=genreET.toString();


    }

    public void onSubmit(View view){
        DBHelper database = new DBHelper(this);
        BookLoc_Itm bookIn = new BookLoc_Itm(id, myLongitude, myLat, titleStr, authorStr, genreStr);
        id++;
        database.addBook(bookIn);
    }
}
