package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import moor.foundation.choseyoursiz.data.Database;
import moor.foundation.choseyoursiz.data.Respirators;
import moor.foundation.choseyoursiz.data.RespiratorsDao;


public class MainActivity extends AppCompatActivity {

    Button ffp1Button;
    Button ffp2Button;
    Button ffp3Button;
    Button noButton;
    Button yesButton;
    Button searchButton;

    int flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ffp1Button = findViewById(R.id.ffp1Button);
        ffp2Button = findViewById(R.id.ffp2Button);
        ffp3Button = findViewById(R.id.ffp3Button);
        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);
        searchButton = findViewById(R.id.searchButton);


        final Intent intent = new Intent(MainActivity.this, NextActivity.class);


        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.ffp1Button:
                        ffp1Button.setEnabled(true);
                        ffp2Button.setEnabled(false);
                        ffp3Button.setEnabled(false);
                        intent.putExtra("ffp1", 1);
                        intent.putExtra("ffp2", 0);
                        intent.putExtra("ffp3", 0);
                        break;
                    case R.id.ffp2Button:
                        ffp2Button.setEnabled(true);
                        ffp1Button.setEnabled(false);
                        ffp3Button.setEnabled(false);
                        intent.putExtra("ffp2", 2);
                        intent.putExtra("ffp1", 0);
                        intent.putExtra("ffp3", 0);
                        break;

                    case R.id.ffp3Button:
                        ffp3Button.setEnabled(true);
                        ffp1Button.setEnabled(false);
                        ffp2Button.setEnabled(false);
                        intent.putExtra("ffp3", 3);
                        intent.putExtra("ffp2", 0);
                        intent.putExtra("ffp1", 0);
                        break;
                    case R.id.yesButton:
                        yesButton.setEnabled(true);
                        break;
                    case R.id.searchButton:
                        startActivity(intent);

                    default:
                        break;
                }


            }
        };

        ffp1Button.setOnClickListener(buttonClickListener);
        ffp2Button.setOnClickListener(buttonClickListener);
        ffp3Button.setOnClickListener(buttonClickListener);
        yesButton.setOnClickListener(buttonClickListener);
        searchButton.setOnClickListener(buttonClickListener);


    }


    public void startTest(View view) {
        ffp1Button.setEnabled(true);
        ffp2Button.setEnabled(true);
        ffp3Button.setEnabled(true);
    }
}