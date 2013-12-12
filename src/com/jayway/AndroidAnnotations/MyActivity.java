package com.jayway.AndroidAnnotations;

import android.app.Activity;
import android.os.Bundle;
import com.googlecode.androidannotations.annotations.EActivity;

@EActivity
public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
