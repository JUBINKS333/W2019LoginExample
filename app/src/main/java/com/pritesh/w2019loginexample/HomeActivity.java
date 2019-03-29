package com.pritesh.w2019loginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Read the value passed from previous activity (LoginActivity)
        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null)//Verify
        {
            if(mBundle.containsKey("name"))//Verify
            {
                String name = mBundle.getString("name");//Fetch from Bundle
                Toast.makeText(this, name, Toast.LENGTH_LONG).show();
            }
        }
    }
}
