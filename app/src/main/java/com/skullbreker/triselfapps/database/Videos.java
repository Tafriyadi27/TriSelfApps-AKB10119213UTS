package com.skullbreker.triselfapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

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
                new Videos("qUL6yKvZgoM"),
                new Videos("9KpO0HchcDg"),
                new Videos("bJu3BtVl3Hc"),

        };
    }
}
