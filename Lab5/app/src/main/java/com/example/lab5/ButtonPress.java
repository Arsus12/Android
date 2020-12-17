package com.example.lab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_press);
        Button button = findViewById(R.id.myButton);

        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView statusText =
                        findViewById(R.id.statusText);
                statusText.setText("Button clicked");
                }
        }
        );
        button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView statusText =
                                findViewById(R.id.statusText);
                        statusText.setText("Long button click");
                        return false;
                    }
                }
        );
    }
}
