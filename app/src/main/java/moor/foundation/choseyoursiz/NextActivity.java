package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import moor.foundation.choseyoursiz.data.App;
import moor.foundation.choseyoursiz.data.Database;
/*import moor.foundation.choseyoursiz.data.DatabaseHelper;*/
import moor.foundation.choseyoursiz.data.Respirators;
import moor.foundation.choseyoursiz.data.RespiratorsDao;

public class NextActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    /*private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;*/

    Database db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Database db = App.getInstance().getDatabase();

        RespiratorsDao respiratorsDao = db.respiratorsDao();

//        List<Respirators> respItem = respiratorsDao.getAll();




        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
//        adapter = new RespAdapter(respItem, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);




        int ffp1 = getIntent().getIntExtra("ffp1",0);
        int ffp2 = getIntent().getIntExtra("ffp2", 0);
        int ffp3 = getIntent().getIntExtra("ffp3", 0);

        if (ffp1 == 1) {
            List<Respirators> respItem2 = respiratorsDao.getFFP1();
            adapter = new RespAdapter(respItem2, this);
            recyclerView.setAdapter(adapter);
            Toast.makeText(this, "Сработал метод ФФП1", Toast.LENGTH_LONG).show();
        } else if (ffp2 == 2) {
            List<Respirators> respItem2 = respiratorsDao.getFFP2();
            adapter = new RespAdapter(respItem2, this);
            recyclerView.setAdapter(adapter);
            Toast.makeText(this, "Сработал метод ФФП2", Toast.LENGTH_LONG).show();
        } else if (ffp3 == 3) {
            List<Respirators> respItem2 = respiratorsDao.getFFP3();
            adapter = new RespAdapter(respItem2, this);
            recyclerView.setAdapter(adapter);
            Toast.makeText(this, "Сработал метод ФФП3", Toast.LENGTH_LONG).show();
        } else {
            List<Respirators> respItem = respiratorsDao.getAll();
            adapter = new RespAdapter(respItem, this);
            recyclerView.setAdapter(adapter);
            Toast.makeText(this, "Ничего не сработало, нубасище", Toast.LENGTH_LONG).show();
        }


    }
}