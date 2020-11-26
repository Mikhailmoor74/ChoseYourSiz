package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.List;

import moor.foundation.choseyoursiz.data.Database;
import moor.foundation.choseyoursiz.data.Respirators;
import moor.foundation.choseyoursiz.data.RespiratorsDao;
import moor.foundation.choseyoursiz.data.Utils;


public class MainActivity extends AppCompatActivity {

    Button ffp1Button;
    Button ffp2Button;
    Button ffp3Button;
    Button noButton;
    Button yesButton;
    Button searchButton;
    Button skladnoiButton;
    Button formButton;
    Button notFormButton;

    Dialog dialog;


    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        ffp1Button = findViewById(R.id.ffp1Button);
        ffp2Button = findViewById(R.id.ffp2Button);
        ffp3Button = findViewById(R.id.ffp3Button);
        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);
        searchButton = findViewById(R.id.searchButton);
        skladnoiButton = findViewById(R.id.skladnoiButton);
        formButton = findViewById(R.id.formovoiButton);
        notFormButton = findViewById(R.id.neformovoiButton);


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
                        noButton.setEnabled(false);
                        intent.putExtra("yesClapan", 40);
                        intent.putExtra("noClapan",0);
                        break;
                    case R.id.noButton:
                        noButton.setEnabled(true);
                        yesButton.setEnabled(false);
                        intent.putExtra("noClapan", 50);
                        intent.putExtra("yesClapan",0);
                        break;
                    case R.id.skladnoiButton:
                        skladnoiButton.setEnabled(true);
                        formButton.setEnabled(false);
                        notFormButton.setEnabled(false);
                        intent.putExtra("skladnoi", 100);
                        intent.putExtra("form", 0);
                        intent.putExtra("notform", 0);
                        break;
                    case R.id.formovoiButton:
                        formButton.setEnabled(true);
                        skladnoiButton.setEnabled(false);
                        notFormButton.setEnabled(false);
                        intent.putExtra("form", 200);
                        intent.putExtra("notform", 0);
                        intent.putExtra("skladnoi", 0);
                        break;
                    case R.id.neformovoiButton:
                        notFormButton.setEnabled(true);
                        skladnoiButton.setEnabled(false);
                        formButton.setEnabled(false);
                        intent.putExtra("notform", 300);
                        intent.putExtra("skladnoi", 0);
                        intent.putExtra("form", 0);
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
        noButton.setOnClickListener(buttonClickListener);
        skladnoiButton.setOnClickListener(buttonClickListener);
        formButton.setOnClickListener(buttonClickListener);
        notFormButton.setOnClickListener(buttonClickListener);
        searchButton.setOnClickListener(buttonClickListener);

        dialog = new Dialog(MainActivity.this);
        dialog.setTitle("Привет");
        dialog.setContentView(R.layout.dialog);
        dialog.setCancelable(true);
        Utils utils = new Utils();

        TextView textView = dialog.findViewById(R.id.dialogTextTextView);
        String dialogText = utils.DIALOG_DESCRIPTION;
        textView.setText(dialogText);
        dialog.getCurrentFocus();

        dialog.dismiss();






    }


    public void startTest(View view) {
        /*ffp1Button.setEnabled(true);
        ffp2Button.setEnabled(true);
        ffp3Button.setEnabled(true);
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        skladnoiButton.setEnabled(true);
        formButton.setEnabled(true);
        notFormButton.setEnabled(true);*/

        recreate();

    }

    public void startDialog(View view) {
        dialog.show();
    }

    public void cancelDialog(View view) {
        dialog.dismiss();
    }
}