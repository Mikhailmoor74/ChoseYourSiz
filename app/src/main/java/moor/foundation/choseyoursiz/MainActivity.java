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

        if (ffp1Button.isEnabled()) {
            Intent intent = new Intent(MainActivity.this, NextActivity.class);
            intent.putExtra("comboOne", ffp1Button.isEnabled());
            startActivity(intent);
        } else {
            Toast.makeText(this, "Не получается", Toast.LENGTH_LONG).show();
        }

        /*if (ffp1Button.isEnabled() || ffp2Button.isEnabled() || ffp3Button.isEnabled()) {
            Intent intent = new Intent(MainActivity.this, NextActivity.class);
            intent.putExtra("ffp1Pressed", ffp1Button.isEnabled());
            intent.putExtra("ffp2Pressed", ffp2Button.isEnabled());
            intent.putExtra("ffp3Pressed", ffp3Button.isEnabled());
            startActivity(intent);
        } else {
            Toast.makeText(this, "Не получается", Toast.LENGTH_LONG).show();
        }*/



    }
}