package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import moor.foundation.choseyoursiz.secrettext.SecretTextView;

public class SplashScreen extends AppCompatActivity {

    SecretTextView secretTextView;
    SecretTextView secretTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(6000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(
                            SplashScreen.this,
                            MainActivity.class));
                }
            }
        };

        thread.start();

        secretTextView = findViewById(R.id.firstDynamic);
        secretTextView.setDuration(3000);
        secretTextView.setIsVisible(true);
        secretTextView.show();

        secretTextView2 = findViewById(R.id.firstDynamic2);
        secretTextView2.setDuration(5000);
        secretTextView2.setIsVisible(true);
        secretTextView2.show();



        /*change = (Button) findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secretTextView.setText("This is really an amazing TextView");
            }
        });*/
    }
}
