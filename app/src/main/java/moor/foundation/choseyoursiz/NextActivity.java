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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Database db = App.getInstance().getDatabase();

        RespiratorsDao respiratorsDao = db.respiratorsDao();

        List<Respirators> respItem = respiratorsDao.getAll();


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RespAdapter(respItem, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        Intent intent = getIntent();

        String ffp1 = intent.getStringExtra("idButton");


        if (ffp1.equals("FFP 1")) {
            respiratorsDao.getFFP1();
        }


    }
}