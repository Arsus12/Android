package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EventHandling extends AppCompatActivity {

    Button btnPressMe;
    Button Touch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling);

        btnPressMe = (Button) findViewById(R.id.myButton1);
        btnPressMe.setOnClickListener((View.OnClickListener) this);

        Touch = (Button) findViewById(R.id.myButton2);
        Touch.setOnClickListener((View.OnClickListener) this);

        }
        public void onClick(View v){
        switch (v.getId()){
            case R.id.myButton1:
                Intent intent = new Intent(this, ButtonPress.class);
                startActivity(intent);
                break;

            case R.id.myButton2:
                Intent intent1 = new Intent(this, ButtonPress.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
        }
    }

