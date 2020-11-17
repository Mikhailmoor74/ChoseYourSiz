package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
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

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Database db = App.getInstance().getDatabase();

        final RespiratorsDao respiratorsDao = db.respiratorsDao();


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    List<Respirators> respItem = respiratorsDao.getAll();
                    adapter = new RespAdapter(respItem, getApplicationContext());
                    recyclerView.setAdapter(adapter);
                } else if (position == 1) {
                    List<Respirators> nrzList = respiratorsDao.getHP3();
                    adapter = new RespAdapter(nrzList, getApplicationContext());
                    recyclerView.setAdapter(adapter);
                } else if (position == 2) {
                    List<Respirators> spiroList = respiratorsDao.getSpiro();
                    adapter = new RespAdapter(spiroList, getApplicationContext());
                    recyclerView.setAdapter(adapter);
                } else if (position == 3) {
                    List<Respirators> alinaList = respiratorsDao.getAlina();
                    adapter = new RespAdapter(alinaList, getApplicationContext());
                    recyclerView.setAdapter(adapter);
                } else if (position == 4) {
                    List<Respirators> threeMList = respiratorsDao.get3M();
                    adapter = new RespAdapter(threeMList, getApplicationContext());
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });







        int ffp1 = getIntent().getIntExtra("ffp1", 0);
        int ffp2 = getIntent().getIntExtra("ffp2", 0);
        int ffp3 = getIntent().getIntExtra("ffp3", 0);
        int yesClapan = getIntent().getIntExtra("yesClapan", 0);
        int noClapan = getIntent().getIntExtra("noClapan", 0);
        int skladnoi = getIntent().getIntExtra("skladnoi", 0);
        int form = getIntent().getIntExtra("form", 0);
        int noForm = getIntent().getIntExtra("notform",0);

        switch (ffp1 + ffp2 + ffp3 + yesClapan + noClapan + skladnoi + form + noForm) {
            case 1:
                List<Respirators> ffp1list = respiratorsDao.getFFP1();
                adapter = new RespAdapter(ffp1list, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                List<Respirators> ffp2list = respiratorsDao.getFFP2();
                adapter = new RespAdapter(ffp2list, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                List<Respirators> ffp3list = respiratorsDao.getFFP3();
                adapter = new RespAdapter(ffp3list, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод ФФП3", Toast.LENGTH_SHORT).show();
                break;
            case 40:
                List<Respirators> yesClapanList = respiratorsDao.getYesClapan();
                adapter = new RespAdapter(yesClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 50:
                List<Respirators> noClapanList = respiratorsDao.getNoClapan();
                adapter = new RespAdapter(noClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод Клапан Нет", Toast.LENGTH_SHORT).show();
                break;
            case 100:
                List<Respirators> skladList = respiratorsDao.getSkladnoi();
                adapter = new RespAdapter(skladList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод Складной", Toast.LENGTH_SHORT).show();
                break;
            case 200:
                List<Respirators> formList = respiratorsDao.getForm();
                adapter = new RespAdapter(formList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод Формованный", Toast.LENGTH_SHORT).show();
                break;
            case 300:
                List<Respirators> noformList = respiratorsDao.getNoForm();
                adapter = new RespAdapter(noformList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод НеФормованный", Toast.LENGTH_SHORT).show();
                break;
            case 41:
                List<Respirators> ffp1YesClapanList = respiratorsDao.getFFP1YesClapan();
                adapter = new RespAdapter(ffp1YesClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 42:
                List<Respirators> ffp2YesClapanList = respiratorsDao.getFFP2YesClapan();
                adapter = new RespAdapter(ffp2YesClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 43:
                List<Respirators> ffp3YesClapanList = respiratorsDao.getFFP3YesClapan();
                adapter = new RespAdapter(ffp3YesClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 51:
                List<Respirators> ffp1NoClapanList = respiratorsDao.getFFP1NoClapan();
                adapter = new RespAdapter(ffp1NoClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 52:
                List<Respirators> ffp2NoClapanList = respiratorsDao.getFFP2NoClapan();
                adapter = new RespAdapter(ffp2NoClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 53:
                List<Respirators> ffp3NoClapanList = respiratorsDao.getFFP3NoClapan();
                adapter = new RespAdapter(ffp3NoClapanList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан ДА", Toast.LENGTH_SHORT).show();
                break;
            case 141:
                List<Respirators> ffp1YesClapanSkladList = respiratorsDao.getFFP1YesClapanSklad();
                adapter = new RespAdapter(ffp1YesClapanSkladList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан ДА и Складной", Toast.LENGTH_SHORT).show();
                break;
            case 142:
                List<Respirators> ffp2YesClapanSkladList = respiratorsDao.getFFP2YesClapanSklad();
                adapter = new RespAdapter(ffp2YesClapanSkladList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан ДА и Складной", Toast.LENGTH_SHORT).show();
                break;
            case 143:
                List<Respirators> ffp3YesClapanSkladList = respiratorsDao.getFFP3YesClapanSklad();
                adapter = new RespAdapter(ffp3YesClapanSkladList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан ДА и Складной", Toast.LENGTH_SHORT).show();
                break;
            case 241:
                List<Respirators> ffp1YesClapanFormList = respiratorsDao.getFFP1YesClapanForm();
                adapter = new RespAdapter(ffp1YesClapanFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан ДА и Формованный", Toast.LENGTH_SHORT).show();
                break;
            case 242:
                List<Respirators> ffp2YesClapanFormList = respiratorsDao.getFFP2YesClapanForm();
                adapter = new RespAdapter(ffp2YesClapanFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан ДА и Формованный", Toast.LENGTH_SHORT).show();
                break;
            case 243:
                List<Respirators> ffp3YesClapanFormList = respiratorsDao.getFFP3YesClapanForm();
                adapter = new RespAdapter(ffp3YesClapanFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан ДА и Формованный", Toast.LENGTH_SHORT).show();
                break;
            case 341:
                List<Respirators> ffp1YesClapanNoFormList = respiratorsDao.getFFP1YesClapanNoForm();
                adapter = new RespAdapter(ffp1YesClapanNoFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан ДА и НеФормованный", Toast.LENGTH_SHORT).show();
                break;
            case 342:
                List<Respirators> ffp2YesClapanNoFormList = respiratorsDao.getFFP2YesClapanNoForm();
                adapter = new RespAdapter(ffp2YesClapanNoFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан ДА и НеФормованный", Toast.LENGTH_SHORT).show();
                break;
            case 343:
                List<Respirators> ffp3YesClapanNoFormList = respiratorsDao.getFFP3YesClapanNoForm();
                adapter = new RespAdapter(ffp3YesClapanNoFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан ДА и НеФормованный", Toast.LENGTH_SHORT).show();
                break;
            case 151:
                List<Respirators> ffp1NoClapanSkladList = respiratorsDao.getFFP1NoClapanSklad();
                adapter = new RespAdapter(ffp1NoClapanSkladList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан Нет и Складной", Toast.LENGTH_SHORT).show();
                break;
            case 152:
                List<Respirators> ffp2NoClapanSkladList = respiratorsDao.getFFP2NoClapanSklad();
                adapter = new RespAdapter(ffp2NoClapanSkladList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан Нет и Складной", Toast.LENGTH_SHORT).show();
                break;
            case 153:
                List<Respirators> ffp3NoClapanSkladList = respiratorsDao.getFFP3NoClapanSklad();
                adapter = new RespAdapter(ffp3NoClapanSkladList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан Нет и Складной", Toast.LENGTH_SHORT).show();
                break;
            case 251:
                List<Respirators> ffp1NoClapanFormList = respiratorsDao.getFFP1NoClapanForm();
                adapter = new RespAdapter(ffp1NoClapanFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан ДА и Формованный", Toast.LENGTH_SHORT).show();
                break;
            case 252:
                List<Respirators> ffp2NoClapanFormList = respiratorsDao.getFFP2NoClapanForm();
                adapter = new RespAdapter(ffp2NoClapanFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан ДА и Формованный", Toast.LENGTH_SHORT).show();
                break;
            case 253:
                List<Respirators> ffp3NoClapanFormList = respiratorsDao.getFFP3NoClapanForm();
                adapter = new RespAdapter(ffp3NoClapanFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан ДА и Формованный", Toast.LENGTH_SHORT).show();
                break;
            case 351:
                List<Respirators> ffp1NoClapanNoFormList = respiratorsDao.getFFP1NoClapanNoForm();
                adapter = new RespAdapter(ffp1NoClapanNoFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 1 и Клапан ДА и НеФормованный", Toast.LENGTH_SHORT).show();
                break;
            case 352:
                List<Respirators> ffp2NoClapanNoFormList = respiratorsDao.getFFP2NoClapanNoForm();
                adapter = new RespAdapter(ffp2NoClapanNoFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 2 и Клапан ДА и НеФормованный", Toast.LENGTH_SHORT).show();
                break;
            case 353:
                List<Respirators> ffp3NoClapanNoFormList = respiratorsDao.getFFP3NoClapanNoForm();
                adapter = new RespAdapter(ffp3NoClapanNoFormList, this);
                recyclerView.setAdapter(adapter);
                Toast.makeText(this, "Сработал метод FFP 3 и Клапан ДА и НеФормованный", Toast.LENGTH_SHORT).show();
                break;
            default:
                List<Respirators> respItem = respiratorsDao.getAll();
                adapter = new RespAdapter(respItem, this);
                recyclerView.setAdapter(adapter);
                break;
        }

    }
}