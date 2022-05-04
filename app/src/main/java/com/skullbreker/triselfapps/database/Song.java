package com.skullbreker.triselfapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Tanggal Pengerjaan   : 30 April 2022
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
@Entity
public class Song {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name ="imagename")
    public String imagename;

    @ColumnInfo(name ="titlesong")
    public String titlesong;

    @ColumnInfo(name ="artistname")
    public String artistname;

    public Song(String imagename,String titlesong,String artistname){
        this.imagename = imagename;
        this.titlesong = titlesong;
        this.artistname = artistname;
    }

    public static Song[] isiLagu(){
        return new Song[]{
                new Song("joytime","Know Me","Marshmello"),
                new Song("joytime","Summer","Marshmello"),
                new Song("joytime","Find Me","Marshmello"),
                new Song("joytime","Take It Back","Marshmello"),
                new Song("joytime","Bounce","Marshmello"),
                new Song("joytime","Blocks","Marshmello"),
                new Song("joytime","Show You","Marshmello"),
                new Song("joytime","Want U 2","Marshmello"),
                new Song("joytime","Home","Marshmello"),
                new Song("joytime","Keep It Mello","Marshmello FT Omar LinX"),
                new Song("joytime2","Star","Marshmello"),
                new Song("joytime2","Together","Marshmello"),
                new Song("joytime2","Rooftops","Marshmello"),
                new Song("joytime2","Check This Out","Marshmello"),
                new Song("joytime2","Flashbacks","Marshmello"),
                new Song("joytime2","Tell Me","Marshmello"),
                new Song("joytime2","Paralyzed","Marshmello"),
                new Song("joytime2","Power","Marshmello"),
                new Song("joytime2","Imagine","Marshmello"),
                new Song("joytime3","Down","Marshmello"),
                new Song("joytime3","Run it Up","Marshmello"),
                new Song("joytime3","Put Yo Hands Up","Marshmello,Slushii"),
                new Song("joytime3","Let's Get Down","Marshmello,YULTRON"),
                new Song("joytime3","Sad Songs","Marshmello"),
                new Song("joytime3","Set Me Free","Marshmello,Bellecour"),
                new Song("joytime3","Room To Fall","Marshmello,Flux Pavilion,Elohim"),
                new Song("joytime3","Angklung Life","Marshmello,Wiwek"),
                new Song("joytime3","Earthquake","Marshmello,TYNAN"),
                new Song("joytime3","Falling To Pieces","Marshmello,Crankdat"),
                new Song("joytime3","Here We Go Again","Marshmello"),
                new Song("joytime3","Rescue Me","Marshmello,A Day To Remember"),
                new Song("joytime3","Proud","Marshmello"),
        };
    }
}
