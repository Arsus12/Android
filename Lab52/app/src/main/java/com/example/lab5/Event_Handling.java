package com.example.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Event_Handling extends AppCompatActivity implements View.OnClickListener {

    Button btnPressMe;
    Button Touch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event__handling);

        btnPressMe = (Button) findViewById(R.id.task1);
        btnPressMe.setOnClickListener(this);

        Touch = (Button) findViewById(R.id.task2);
        Touch.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.task1:
                Intent intent = new Intent(this, Task1.class);
                startActivity(intent);
                break;

            case R.id.task2:
                Intent intent1 = new Intent(this, Touch.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
