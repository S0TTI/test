package com.example.sotti_h.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.sotti_h.myapplication.VpnDaemons;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VpnDaemons l = new VpnDaemons();
        try {
            l.startPptp("193.242.195.11","iman","4414",false);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
