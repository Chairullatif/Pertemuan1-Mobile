package com.khoirullatif.cerc_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String EXTRA_NIM = "extra_nim";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String nim = getIntent().getStringExtra(EXTRA_NIM);
        String text = "Name : " + name + ",\nYour Nim : " + nim;
        tvDataReceived.setText(text);
    }
}
