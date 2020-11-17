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
        Utils utils = new Utils();

        // Респираторы НРЗ
        Respirators respNrz0101 = new Respirators();
        respNrz0101.title = "НРЗ-0101";
        respNrz0101.classOfDefend = "FFP 1";
        respNrz0101.clapan = "Нет";
        respNrz0101.construction = "Формованный";
        respNrz0101.imageResource = R.drawable.nrz0101;
        respNrz0101.description = utils.RESP_NRZ_0101;
        respiratorsDao.insert(respNrz0101);

        Respirators respNrz0102 = new Respirators();
        respNrz0102.title = "НРЗ-0102";
        respNrz0102.classOfDefend = "FFP 2";
        respNrz0102.clapan = "Нет";
        respNrz0102.construction = "Формованный";
        respNrz0102.imageResource = R.drawable.nrz0102;
        respNrz0102.description = utils.RESP_NRZ_0102;
        respiratorsDao.insert(respNrz0102);

        Respirators respNrz0111 = new Respirators();
        respNrz0111.title = "НРЗ-0111";
        respNrz0111.classOfDefend = "FFP 1";
        respNrz0111.clapan = "Да";
        respNrz0111.construction = "Формованный";
        respNrz0111.imageResource = R.drawable.nrz0111;
        respNrz0111.description = utils.RESP_NRZ_0111;
        respiratorsDao.insert(respNrz0111);

        Respirators respNrz0112 = new Respirators();
        respNrz0112.title = "НРЗ-0112";
        respNrz0112.classOfDefend = "FFP 2";
        respNrz0112.clapan = "Да";
        respNrz0112.construction = "Формованный";
        respNrz0112.imageResource = R.drawable.nrz0112;
        respNrz0112.description = utils.RESP_NRZ_0112;
        respiratorsDao.insert(respNrz0112);

        Respirators respNrz0113 = new Respirators();
        respNrz0113.title = "НРЗ-0113";
        respNrz0113.classOfDefend = "FFP 3";
        respNrz0113.clapan = "Да";
        respNrz0113.construction = "Формованный";
        respNrz0113.imageResource = R.drawable.nrz0113;
        respiratorsDao.insert(respNrz0113);

        Respirators respNrz0112a = new Respirators();
        respNrz0112a.title = "НРЗ-0112А";
        respNrz0112a.classOfDefend = "FFP 2";
        respNrz0112a.clapan = "Да";
        respNrz0112a.construction = "Формованный";
        respNrz0112a.imageResource = R.drawable.nrz0112a;
        respNrz0112a.description = utils.RESP_NRZ_0112A;
        respiratorsDao.insert(respNrz0112a);

        Respirators respNrz0112av = new Respirators();
        respNrz0112av.title = "НРЗ-0112АВ";
        respNrz0112av.classOfDefend = "FFP 2";
        respNrz0112av.clapan = "Да";
        respNrz0112av.construction = "Формованный";
        respNrz0112av.imageResource = R.drawable.nrz0112av;
        respNrz0112av.description = utils.RESP_NRZ_0112AV;
        respiratorsDao.insert(respNrz0112av);

        Respirators respNrz0112v = new Respirators();
        respNrz0112v.title = "НРЗ-0112АВ";
        respNrz0112v.classOfDefend = "FFP 2";
        respNrz0112v.clapan = "Да";
        respNrz0112v.construction = "Формованный";
        respNrz0112v.imageResource = R.drawable.nrz0112v;
        respNrz0112v.description = utils.RESP_NRZ_0112V;
        respiratorsDao.insert(respNrz0112v);

        Respirators respNrz1101 = new Respirators();
        respNrz1101.title = "НРЗ-1101";
        respNrz1101.classOfDefend = "FFP 1";
        respNrz1101.clapan = "Нет";
        respNrz1101.construction = "Складной";
        respNrz1101.imageResource = R.drawable.nrz1101;
        respNrz1101.description = utils.RESP_NRZ_1101;
        respiratorsDao.insert(respNrz1101);

        Respirators respNrz1102 = new Respirators();
        respNrz1102.title = "НРЗ-1102";
        respNrz1102.classOfDefend = "FFP 2";
        respNrz1102.clapan = "Нет";
        respNrz1102.construction = "Складной";
        respNrz1102.imageResource = R.drawable.nrz1102;
        respNrz1102.description = utils.RESP_NRZ_1102;
        respiratorsDao.insert(respNrz1102);

        Respirators respNrz1201 = new Respirators();
        respNrz1201.title = "НРЗ-1201";
        respNrz1201.classOfDefend = "FFP 1";
        respNrz1201.clapan = "Нет";
        respNrz1201.construction = "Складной";
        respNrz1201.imageResource = R.drawable.nrz1201;
        respNrz1201.description = utils.RESP_NRZ_1201;
        respiratorsDao.insert(respNrz1201);

        Respirators respNrz1202 = new Respirators();
        respNrz1202.title = "НРЗ-1202";
        respNrz1202.classOfDefend = "FFP 2";
        respNrz1202.clapan = "Нет";
        respNrz1202.construction = "Складной";
        respNrz1202.imageResource = R.drawable.nrz1202;
        respNrz1202.description = utils.RESP_NRZ_1202;
        respiratorsDao.insert(respNrz1202);

        Respirators respNrz1203 = new Respirators();
        respNrz1203.title = "НРЗ-1203";
        respNrz1203.classOfDefend = "FFP 3";
        respNrz1203.clapan = "Нет";
        respNrz1203.construction = "Складной";
        respNrz1203.imageResource = R.drawable.nrz1203;
        respNrz1203.description = utils.RESP_NRZ_1203;
        respiratorsDao.insert(respNrz1203);

        Respirators respNrz1211 = new Respirators();
        respNrz1211.title = "НРЗ-1211";
        respNrz1211.classOfDefend = "FFP 1";
        respNrz1211.clapan = "Да";
        respNrz1211.construction = "Складной";
        respNrz1211.imageResource = R.drawable.nrz1211;
        respNrz1211.description = utils.RESP_NRZ_1211;
        respiratorsDao.insert(respNrz1211);

        Respirators respNrz1212 = new Respirators();
        respNrz1212.title = "НРЗ-1212";
        respNrz1212.classOfDefend = "FFP 2";
        respNrz1212.clapan = "Да";
        respNrz1212.construction = "Складной";
        respNrz1212.imageResource = R.drawable.nrz1212;
        respNrz1212.description = utils.RESP_NRZ_1212;
        respiratorsDao.insert(respNrz1212);

        Respirators respNrz1213 = new Respirators();
        respNrz1213.title = "НРЗ-1213";
        respNrz1213.classOfDefend = "FFP 3";
        respNrz1213.clapan = "Да";
        respNrz1213.construction = "Складной";
        respNrz1213.imageResource = R.drawable.nrz1213;
        respNrz1213.description = utils.RESP_NRZ_1213;
        respiratorsDao.insert(respNrz1213);

        Respirators respNrz1212av = new Respirators();
        respNrz1212av.title = "НРЗ-1212АВ";
        respNrz1212av.classOfDefend = "FFP 2";
        respNrz1212av.clapan = "Да";
        respNrz1212av.construction = "Складной";
        respNrz1212av.imageResource = R.drawable.nrz1212av;
        respNrz1212av.description = utils.RESP_NRZ_1213AV;
        respiratorsDao.insert(respNrz1212av);

        //Респираторы Спиро

        Respirators spiro313 = new Respirators();
        spiro313.title = "Спиро-313";
        spiro313.classOfDefend = "FFP 3";
        spiro313.clapan = "Да";
        spiro313.construction = "Формованный";
        spiro313.imageResource = R.drawable.spiro313;
        spiro313.description = utils.RESP_SPIRO_313;
        respiratorsDao.insert(spiro313);

        Respirators spiro201 = new Respirators();
        spiro201.title = "Спиро-201";
        spiro201.classOfDefend = "FFP 1";
        spiro201.clapan = "Нет";
        spiro201.construction = "Складной";
        spiro201.imageResource = R.drawable.spiro201;
        spiro201.description = utils.RESP_SPIRO_201;
        respiratorsDao.insert(spiro201);

        Respirators spiro212 = new Respirators();
        spiro212.title = "Спиро-212";
        spiro212.classOfDefend = "FFP 2";
        spiro212.clapan = "Да";
        spiro212.construction = "Складной";
        spiro212.imageResource = R.drawable.spiro212;
        spiro212.description = utils.RESP_SPIRO_212;
        respiratorsDao.insert(spiro212);

        Respirators spiro312 = new Respirators();
        spiro312.title = "Спиро-312";
        spiro312.classOfDefend = "FFP 2";
        spiro312.clapan = "Да";
        spiro312.construction = "Формованный";
        spiro312.imageResource = R.drawable.spiro312;
        spiro312.description = utils.RESP_SPIRO_312;
        respiratorsDao.insert(spiro312);

        Respirators spiro311 = new Respirators();
        spiro311.title = "Спиро-311";
        spiro311.classOfDefend = "FFP 1";
        spiro311.clapan = "Да";
        spiro311.construction = "Формованный";
        spiro311.imageResource = R.drawable.spiro311;
        spiro311.description = utils.RESP_SPIRO_311;
        respiratorsDao.insert(spiro311);

        Respirators spiro303 = new Respirators();
        spiro303.title = "Спиро-303";
        spiro303.classOfDefend = "FFP 3";
        spiro303.clapan = "Нет";
        spiro303.construction = "Формованный";
        spiro303.imageResource = R.drawable.spiro303;
        spiro303.description = utils.RESP_SPIRO_303;
        respiratorsDao.insert(spiro303);

        Respirators spiro302 = new Respirators();
        spiro302.title = "Спиро-302";
        spiro302.classOfDefend = "FFP 2";
        spiro302.clapan = "Нет";
        spiro302.construction = "Формованный";
        spiro302.imageResource = R.drawable.spiro302;
        spiro302.description = utils.RESP_SPIRO_302;
        respiratorsDao.insert(spiro302);

        Respirators spiro301 = new Respirators();
        spiro301.title = "Спиро-301";
        spiro301.classOfDefend = "FFP 1";
        spiro301.clapan = "Нет";
        spiro301.construction = "Формованный";
        spiro301.imageResource = R.drawable.spiro301;
        spiro301.description = utils.RESP_SPIRO_301;
        respiratorsDao.insert(spiro301);

        Respirators spiro213 = new Respirators();
        spiro213.title = "Спиро-213";
        spiro213.classOfDefend = "FFP 3";
        spiro213.clapan = "Да";
        spiro213.construction = "Складной";
        spiro213.imageResource = R.drawable.spiro213;
        spiro213.description = utils.RESP_SPIRO_213;
        respiratorsDao.insert(spiro213);

        Respirators spiro211 = new Respirators();
        spiro211.title = "Спиро-211";
        spiro211.classOfDefend = "FFP 1";
        spiro211.clapan = "Да";
        spiro211.construction = "Складной";
        spiro211.imageResource = R.drawable.spiro211;
        spiro211.description = utils.RESP_SPIRO_211;
        respiratorsDao.insert(spiro211);

        Respirators spiro203 = new Respirators();
        spiro203.title = "Спиро-203";
        spiro203.classOfDefend = "FFP 3";
        spiro203.clapan = "Нет";
        spiro203.construction = "Складной";
        spiro203.imageResource = R.drawable.spiro203;
        spiro203.description = utils.RESP_SPIRO_203;
        respiratorsDao.insert(spiro203);


    }

    public static App getInstance() {
        return instance;
    }

    public Database getDatabase() {
        return database;
    }
}
