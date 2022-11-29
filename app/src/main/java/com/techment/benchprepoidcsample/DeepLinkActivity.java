package com.techment.benchprepoidcsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DeepLinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_link);

     String accessToken =   getIntent().getData().getQueryParameter("accesstoken");
     TextView accessTokenTv =findViewById(R.id.accessToken);

     if (accessToken ==null || accessToken.isEmpty()){
         accessTokenTv.setText("Authentication Failure");
     }else {
         accessTokenTv.setText("Access Token:: \n"+accessToken);
     }




    }

}