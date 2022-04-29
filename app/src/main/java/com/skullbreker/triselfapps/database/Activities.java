package com.skullbreker.triselfapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Activities {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name ="kegiatan")
    public String kegiatan;

    public Activities(String kegiatan){
        this.kegiatan = kegiatan;
    }

    public static Activities[] isiAktifitas(){
        return new Activities[]{
                new Activities("Menonton Vtuber"),
                new Activities("Mendengarkan Musik"),
                new Activities("Menonton Streamer"),
                new Activities("Menonton Youtuber"),
        };
    }
}
