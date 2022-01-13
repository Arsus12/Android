package com.example.carshop.RoomData;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "words")
public class Words {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "word")
    public String word;
}
