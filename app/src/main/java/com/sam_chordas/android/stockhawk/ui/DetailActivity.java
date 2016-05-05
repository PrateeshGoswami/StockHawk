package com.sam_chordas.android.stockhawk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sam_chordas.android.stockhawk.R;

/**
 * @author Prateesh Goswami
 * @version 1.0
 * @date 5/4/2016
 */
public class DetailActivity extends AppCompatActivity{
    public static final String TAG = DetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_graph);
        Intent intent = getIntent();
        String symbol = intent.getStringExtra("symbol");
        Log.d(TAG, "Testing: " + symbol);
    }
}
