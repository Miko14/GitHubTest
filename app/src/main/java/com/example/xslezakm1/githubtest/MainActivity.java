package com.example.xslezakm1.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void test() {
        int i = 1 + 1;

        int ii = 2 + 2;

        int iii = i + ii;
    }
}
