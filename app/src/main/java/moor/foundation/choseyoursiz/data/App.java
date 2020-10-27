package moor.foundation.choseyoursiz.data;

import android.app.Application;

import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import moor.foundation.choseyoursiz.R;

public class App extends Application {

    public static App instance;

    private Database database;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        database = Room.databaseBuilder(this, Database.class, "respirators.db").allowMainThreadQueries().build();


        RespiratorsDao respiratorsDao = database.respiratorsDao();
        respiratorsDao.deleteAll();

        Respirators respNrz0101 = new Respirators();
        respNrz0101.title = "НРЗ-0101";
        respNrz0101.classOfDefend = "FFP 1";
        respNrz0101.clapan = "Нет";
        respNrz0101.construction = "Формованный";
        respNrz0101.imageResource = R.drawable.nrz0101;
        respiratorsDao.insert(respNrz0101);

        Respirators respNrz0111 = new Respirators();
        respNrz0111.title = "НРЗ-0111";
        respNrz0111.classOfDefend = "FFP 1";
        respNrz0111.clapan = "Да";
        respNrz0111.construction = "Формованный";
        respNrz0111.imageResource = R.drawable.nrz0111;
        respiratorsDao.insert(respNrz0111);

        Respirators respNrz0113 = new Respirators();
        respNrz0113.title = "НРЗ-0113";
        respNrz0113.classOfDefend = "FFP 3";
        respNrz0113.clapan = "Да";
        respNrz0113.construction = "Формованный";
        respNrz0113.imageResource = R.drawable.nrz0113;
        respiratorsDao.insert(respNrz0113);

        Respirators respNrz0102 = new Respirators();
        respNrz0102.title = "НРЗ-0102";
        respNrz0102.classOfDefend = "FFP 2";
        respNrz0102.clapan = "Нет";
        respNrz0102.construction = "Формованный";
        respNrz0102.imageResource = R.drawable.nrz0113; // поменять картинку
        respiratorsDao.insert(respNrz0102);

        Respirators spiro313 = new Respirators();
        spiro313.title = "Спиро-313";
        spiro313.classOfDefend = "FFP 3";
        spiro313.clapan = "Да";
        spiro313.construction = "Формованный";
        respiratorsDao.insert(spiro313);

        Respirators spiro201 = new Respirators();
        spiro201.title = "Спиро-201";
        spiro201.classOfDefend = "FFP 1";
        spiro201.clapan = "Нет";
        spiro201.construction = "Складной";
        respiratorsDao.insert(spiro201);

        Respirators spiro212 = new Respirators();
        spiro212.title = "Спиро-212";
        spiro212.classOfDefend = "FFP 2";
        spiro212.clapan = "Да";
        spiro212.construction = "Складной";
        respiratorsDao.insert(spiro212);

        Respirators spiro312 = new Respirators();
        spiro312.title = "Спиро-312";
        spiro312.classOfDefend = "FFP 2";
        spiro312.clapan = "Да";
        spiro312.construction = "Формованный";
        respiratorsDao.insert(spiro312);


    }

    public static App getInstance() {
        return instance;
    }

    public Database getDatabase() {
        return database;
    }
}
