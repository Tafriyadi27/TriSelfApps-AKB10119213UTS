package com.skullbreker.triselfapps.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

@Database(entities = {Friend.class,Activities.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FriendDao friendDao();
    public abstract ActivitiesDao activitiesDao();

        private static AppDatabase INSTANCE;

    public static AppDatabase getDbInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "triselfapps")
                    .allowMainThreadQueries()
                    .addCallback(new Callback() {
                        @Override
                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                            super.onCreate(db);
                            Executors.newSingleThreadExecutor().execute(() -> getDbInstance(context).friendDao().insert(Friend.isiData()));
                            Executors.newSingleThreadExecutor().execute(() -> getDbInstance(context).activitiesDao().insert(Activities.isiAktifitas()));
                        }
                    })
                    .build();
        }
        return INSTANCE;
    }

}
