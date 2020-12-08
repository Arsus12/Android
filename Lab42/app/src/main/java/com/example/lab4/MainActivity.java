package com.example.lab4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cat();
    }
    public class Cat {

        public String name; // имя
        public int age; // возраст
        public int color; // цвет

    }
    private void Cat(){
        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 9;
        murzik.color = Color.BLACK;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        TextView textView = findViewById(R.id.textView);
        textView.setText(gson.toJson(murzik));
    }
}

