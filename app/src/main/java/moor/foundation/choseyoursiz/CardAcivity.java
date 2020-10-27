package moor.foundation.choseyoursiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CardAcivity extends AppCompatActivity {

    TextView titleTextView;
    TextView classOfDefendTextView;
    TextView clapanTextView;
    TextView constructionTextView;
    ImageView imageView;
    TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        titleTextView = findViewById(R.id.TitleTextView2);
        classOfDefendTextView = findViewById(R.id.classOfDefendtextView);
        clapanTextView = findViewById(R.id.ClapanTextView);
        constructionTextView = findViewById(R.id.ConstructionTextView);
        imageView = findViewById(R.id.imageView);
        descriptionTextView = findViewById(R.id.descriptionTextView);

        Intent intent = getIntent();

        if (intent != null) {
            titleTextView.setText(intent.getStringExtra("title"));
            classOfDefendTextView.setText(intent.getStringExtra("classofdefend"));
            clapanTextView.setText(intent.getStringExtra("clapan"));
            constructionTextView.setText(intent.getStringExtra("construction"));
            imageView.setImageResource(intent.getIntExtra("image",0));
            descriptionTextView.setText(intent.getStringExtra("description"));

        }
    }
}