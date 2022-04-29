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

    @ColumnInfo(name ="imagename")
    public String imagename;

    public Activities(String kegiatan,String imagename){
        this.kegiatan = kegiatan;
        this.imagename = imagename;
    }

    public static Activities[] isiAktifitas(){
        return new Activities[]{
                new Activities("Menonton Vtuber","image1"),
                new Activities("Mendengarkan Musik","image2"),
                new Activities("Menonton Streamer","image3"),
                new Activities("Menonton Youtuber","image4"),
                new Activities("Gaming PCBS","image5"),
                new Activities("Gaming Apex Legends","image6"),
                new Activities("Menonton KPOP MV","image7"),
                new Activities("Menonton Anime","image8"),
                new Activities("Ngoding","image9"),
                new Activities("Gaming Valorant","image10"),
        };
    }
}
