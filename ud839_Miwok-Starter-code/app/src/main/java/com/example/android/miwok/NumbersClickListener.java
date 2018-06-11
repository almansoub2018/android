package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Open the numbers list",Toast.LENGTH_LONG).show();
    }
}
