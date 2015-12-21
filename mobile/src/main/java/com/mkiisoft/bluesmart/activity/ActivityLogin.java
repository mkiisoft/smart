package com.mkiisoft.bluesmart.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mkiisoft.bluesmart.R;

/**
 * Created by mariano on 12/20/15.
 */
public class ActivityLogin extends AppCompatActivity {

    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_login);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
            getSupportActionBar().setTitle("");
        }

    }
}
