package com.example.lab4;

import android.graphics.Color;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Cat {
    public String name; // имя
    public int age; // возраст
    public int color; // цвет

    // Конструктор
    public Cat(){
        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 9;
        murzik.color = Color.BLACK;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Log.i("GSON", gson.toJson(murzik));
    }
}
