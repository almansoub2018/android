package com.example.android.appendviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add textView at runtime
        TextView sampleText = new TextView(this);
        sampleText.setText("wooow");

        LinearLayout myLayout = findViewById(R.id.main);
        sampleText.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        );

        myLayout.addView(sampleText);

    }
}
