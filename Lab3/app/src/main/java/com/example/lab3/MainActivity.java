package com.example.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /** Вспомогательный класс для заполнения списка */
    public static class DummyContent {
        /** Списочный массив элементов */
        public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
        private static final int COUNT = 25;

        static {
            // Добавление элементов в список.
            for (int k = 1; k <= COUNT; k++) {
                StringBuilder builder = new StringBuilder();
                builder.append("Информация об элементе:   ").append(k);
                for (int j = 0; j < k; j++) { builder.append("\n Детальная информация. "); }
                ITEMS.add(new DummyItem(String.valueOf(k), "Элемент " + k, builder.toString()));
            }
        }

        /** Создание класса элементов для списка. */
        public static class DummyItem {
            public final String id;
            public final String content;
            public final String details;

            public DummyItem(String id, String content, String details) {
                this.id = id;
                this.content = content;
                this.details = details;
            }
            @Override
            public String toString() { return content; }
        }
    }

}
