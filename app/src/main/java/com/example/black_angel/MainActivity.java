package com.example.black_angel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    @Override
    public void onBackPressed(){
        //super.onBackPressed();
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_lock_idle_lock)
                .setTitle("Exit Game.")
                .setMessage("Do you want to exit?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    finish();
                    System.exit(0);
                })
                .setNegativeButton("No", null).show();
    }
}