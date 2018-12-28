package com.example.sandroperic.prijemniceiotpremnice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class glavni_meni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavni_meni);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void toPrijemnica(View v) {
        Intent intent = new Intent(glavni_meni.this, prijemnica.class);
        startActivity(intent);
    }
    public void toOtpremnica(View v) {
        Intent intent = new Intent(glavni_meni.this, otpremnica.class);
        startActivity(intent);
    }
}
