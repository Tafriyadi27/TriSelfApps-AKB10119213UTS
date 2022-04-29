package com.skullbreker.triselfapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Friend {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name ="friend_name")
    public String friendName;

    @ColumnInfo(name ="code_name")
    public String codeName;

    public Friend(String friendName,String codeName){
        this.friendName = friendName;
        this.codeName = codeName;
    }

    public static Friend[] isiData(){
        return new Friend[]{
                new Friend("Denden Triana","Sakura"),
                new Friend("Joyson Sitorus","Gigachad Enjoyer"),
                new Friend("Najib Raffi Irdhana","Gay Mastah"),
                new Friend("Muhammad Ridwan","Secondary Intel"),
        };
    }


}
