package moor.foundation.choseyoursiz.data;

import android.content.Context;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Respirators.class}, version = 2)
public abstract class Database extends RoomDatabase {


    public abstract RespiratorsDao respiratorsDao();


}
