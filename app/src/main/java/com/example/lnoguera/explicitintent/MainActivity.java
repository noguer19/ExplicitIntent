package com.example.lnoguera.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        submitBtn = (Button) findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity_SecondWay();
            }
        });

    }

    private void moveToSecondActivity_FirstWay(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        Bundle b = new Bundle();
        b.putString(Constants.KEY_NAME, nameEditText.getText().toString());
        b.putInt(Constants.KEY_AGE, 25);

        intent.putExtras(b);
        startActivity(intent);
    }

    private void moveToSecondActivity_SecondWay(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(Constants.KEY_NAME, nameEditText.getText().toString());
        intent.putExtra(Constants.KEY_AGE, 25);

        startActivity(intent);
    }
}
