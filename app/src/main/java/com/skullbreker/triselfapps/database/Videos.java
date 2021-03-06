package com.skullbreker.triselfapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Tanggal Pengerjaan   : 1 Mei 2022
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
@Entity
public class Videos {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name ="videoid")
    public String videoid;

    public Videos(String videoid){
        this.videoid = videoid;
    }

    public static Videos[] isiVideo(){
        return new Videos[]{
                new Videos("5E4ZBSInqUU"),
                new Videos("R9q5lBy2w1E"),
                new Videos("vPwaXytZcgI"),
                new Videos("R9At2ICm4LQ"),
                new Videos("HhjHYkPQ8F0"),
                new Videos("lzkKzZmRZk8"),
                new Videos("nfVcDJ584RA"),
                new Videos("UjZqcDYbvAE"),
                new Videos("Hh9yZWeTmVM"),
                new Videos("bJu3BtVl3Hc"),

        };
    }
}
