package com.example.lnoguera.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView);
        StringBuilder msg = new StringBuilder("¡Welcome \n");

        Intent i = getIntent();
        Bundle b = i.getExtras();

        if(b.containsKey(Constants.KEY_NAME)){
            String name = b.getString(Constants.KEY_NAME, "My default name") ;
            msg.append(name);
        }

        if(b.containsKey(Constants.KEY_AGE)){
            Integer age = b.getInt(Constants.KEY_AGE, 30);
            msg.append("\n").append("You are " + age).append(" years old");
        }


        textView.setText(msg);




    }
}
