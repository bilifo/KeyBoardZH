package com.setproject.bilifo.keyboard;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.setproject.bilifo.keyboard.databinding.ActivityMainBinding;

import item.KeyboardEnLayout;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    KeyboardEnLayout en_keyboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        en_keyboard=new KeyboardEnLayout(this);
        binding.keybroadFrame2.addView(en_keyboard.getRootView());
    }
}
