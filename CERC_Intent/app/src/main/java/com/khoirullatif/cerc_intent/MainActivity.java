package com.khoirullatif.cerc_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithDataActivity = findViewById(R.id.btn1);
        btnMoveWithDataActivity.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_num);
        btnDialPhone.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn1:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Chairullatif Aji Sadewa");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NIM, "21120119120015");
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_dial_num:
                String phoneNumber = "085741163477";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

        }
    }

}
