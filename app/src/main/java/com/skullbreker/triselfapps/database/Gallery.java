package com.skullbreker.triselfapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Tanggal Pengerjaan   : 30 April 2022
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
@Entity
public class Gallery {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name ="imagename")
    public String imagename;

    public Gallery(String imagename){
        this.imagename = imagename;
    }
    public static Gallery[] isiFoto(){
        return new Gallery[]{
                new Gallery("gallery1"),
                new Gallery("gallery2"),
                new Gallery("gallery3"),
                new Gallery("gallery4"),
                new Gallery("gallery5"),
                new Gallery("gallery6"),
                new Gallery("gallery7"),
                new Gallery("gallery8"),
                new Gallery("gallery9"),
                new Gallery("gallery10"),
                new Gallery("gallery11"),
                new Gallery("gallery12"),

        };
    }
}
