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


        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.ffp2Button:
                        ffp2Button.setEnabled(true);
                        ffp2Button.setBackgroundColor(Color.GRAY);
                        break;
                    case R.id.ffp1Button:
                        ffp1Button.setBackgroundColor(Color.GRAY);
                        ffp1Button.setEnabled(true);
                        break;

                    case R.id.ffp3Button:
                        ffp3Button.setEnabled(true);
                        ffp3Button.setBackgroundColor(Color.GRAY);
                        break;
                    case R.id.yesButton:
                        yesButton.setEnabled(true);
                        yesButton.setBackgroundColor(Color.GRAY);
                        break;

                    default:
                        break;
                }


            }
        };

        ffp1Button.setOnClickListener(buttonClickListener);
        ffp2Button.setOnClickListener(buttonClickListener);
        ffp3Button.setOnClickListener(buttonClickListener);
        yesButton.setOnClickListener(buttonClickListener);


    }


    public void startSearch(View view) {


        Intent intent = new Intent(MainActivity.this, NextActivity.class);

        switch (view.getId()) {
            case R.id.ffp1Button:
                ffp1Button.setEnabled(true);
                intent.putExtra("ffp1", ffp1Button.getText());
                break;
            case R.id.ffp2Button:
                ffp2Button.setEnabled(true);
                intent.putExtra("ffp2", ffp2Button.getText());
        }


        if (ffp1Button.isEnabled()) {
            intent.putExtra("ffp1", 1);
            Toast.makeText(this, "Вставилось значение 1", Toast.LENGTH_LONG).show();
        } else if (ffp2Button.isEnabled()) {
            intent.putExtra("ffp2", 2);
            Toast.makeText(this, "Вставилось значение 2", Toast.LENGTH_LONG).show();
        } else if (ffp3Button.isEnabled()) {
            intent.putExtra("ffp3", 3);
            Toast.makeText(this, "Вставилось значение 3", Toast.LENGTH_LONG).show();
        }
        startActivity(intent);

        if (ffp1Button.isEnabled() || ffp2Button.isEnabled() || ffp3Button.isEnabled()) {
            intent.putExtra("ffp1", ffp1Button.getText());
        }

    }

    public void startTest(View view) {
        Intent intent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(intent);
    }
}