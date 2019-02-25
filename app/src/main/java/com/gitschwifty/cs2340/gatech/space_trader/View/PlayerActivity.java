package com.gitschwifty.cs2340.gatech.space_trader.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.gitschwifty.cs2340.gatech.space_trader.R;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        String player = getIntent().getStringExtra("extra");
        TextView playerText = (TextView) findViewById(R.id.player);
        playerText.setText(player);
    }
}
