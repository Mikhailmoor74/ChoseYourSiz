package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import moor.foundation.choseyoursiz.data.Database;
import moor.foundation.choseyoursiz.data.Respirators;
import moor.foundation.choseyoursiz.data.RespiratorsDao;


public class MainActivity extends AppCompatActivity {

    Button ffp1Button;
    Button ffp2Button;
    Button ffp3Button;
    Button noButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ffp1Button = findViewById(R.id.ffp1Button);
        ffp2Button = findViewById(R.id.ffp2Button);
        ffp3Button = findViewById(R.id.ffp3Button);
        noButton = findViewById(R.id.noButton);


        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.ffp2Button:
                        ffp1Button.setEnabled(false);
                        ffp3Button.setEnabled(false);
                        ffp2Button.setBackgroundColor(Color.GRAY);
                        break;
                    case R.id.ffp1Button:
                        ffp1Button.setBackgroundColor(Color.GRAY);
                        ffp2Button.setEnabled(false);
                        ffp3Button.setEnabled(false);
                        break;

                    case R.id.ffp3Button:
                        ffp1Button.setEnabled(false);
                        ffp2Button.setEnabled(false);
                        ffp3Button.setBackgroundColor(Color.GRAY);
                        break;
                    default:
                        break;

                }
            }
        };

        ffp1Button.setOnClickListener(buttonClickListener);
        ffp2Button.setOnClickListener(buttonClickListener);
        ffp3Button.setOnClickListener(buttonClickListener);




    }




    public void startSearch(View view) {


        Intent intent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(intent);
    }
}