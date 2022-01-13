package com.example.carshop;

import java.util.ArrayList;
import java.util.List;

public class DummyContent {
    /** Списочный массив элементов */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    static {

        StringBuilder builder = new StringBuilder();

        ITEMS.add(new DummyItem(String.valueOf(1), "СпортКары" , builder.toString()));

        ITEMS.add(new DummyItem(String.valueOf(2), "Купе" , builder.toString()));

        ITEMS.add(new DummyItem(String.valueOf(3), "Легковые" , builder.toString()));
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
