package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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






        int ffp1 = getIntent().getIntExtra("ffp1", 0);
        int ffp2 = getIntent().getIntExtra("ffp2", 0);
        int ffp3 = getIntent().getIntExtra("ffp3", 0);
        int yesClapan = getIntent().getIntExtra("yesClapan", 0);
        int noClapan = getIntent().getIntExtra("noClapan", 0);
        int form = getIntent().getIntExtra("form", 0);



        /*switch (ffp1 + yesClapan + form) {
            case 1:
                List<Respirators> respItem2 = respiratorsDao.getFFP1();
                adapter = new RespAdapter(respItem2, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП1", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                List<Respirators> respItem3 = respiratorsDao.getFFP1YesClapan();
                adapter = new RespAdapter(respItem3, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП1 и Клапан Да", Toast.LENGTH_SHORT).show();
                break;
            case 12:
                List<Respirators> respItem4 = respiratorsDao.getFFP1YesClapanForm();
                adapter = new RespAdapter(respItem4, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП1 и Клапан Да и ФОРМ", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }

        switch (ffp2 + yesClapan + form) {
            case 2:
                List<Respirators> respItem5 = respiratorsDao.getFFP2();
                adapter = new RespAdapter(respItem5, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП2", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                List<Respirators> respItem6 = respiratorsDao.getFFP2YesClapan();
                adapter = new RespAdapter(respItem6, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП2 и Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 13:
                List<Respirators> respItem7 = respiratorsDao.getFFP2YesClapanForm();
                adapter = new RespAdapter(respItem7, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП2 и Клапан ДА и ФОРМ", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;


        }*/


    }
}