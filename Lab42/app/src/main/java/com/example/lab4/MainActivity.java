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
        murzik.age = 3;
        murzik.color = Color.GREEN;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        TextView textView = findViewById(R.id.textView);
        View view = findViewById(R.id.Collor);
        textView.setText(gson.toJson(murzik));
        String jsonText = gson.toJson(murzik);
        Cat murzik1 = gson.fromJson(jsonText, Cat.class);
        textView.setText("Имя: " + murzik1.name + "\nВозраст: " + murzik1.age);
        view.setBackgroundColor(murzik1.color);
    }
}

