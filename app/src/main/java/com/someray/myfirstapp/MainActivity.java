package com.someray.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.someray.myfirstapp.MESSAGE";
    private HashSet mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    private void initData() {
        mData.clear();
        for (int i = 0; i < 8; i++) {
            mData.add(i);
        }
    }


}
