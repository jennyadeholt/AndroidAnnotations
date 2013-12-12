package com.jayway.AndroidAnnotations;

import android.app.Activity;
import android.widget.Toast;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.main)
public class MyActivity extends Activity {


    @Click
    void onButtonClicked(){
        Toast.makeText(this, "Hello hey, what's your name?", Toast.LENGTH_LONG).show();
    }

}
