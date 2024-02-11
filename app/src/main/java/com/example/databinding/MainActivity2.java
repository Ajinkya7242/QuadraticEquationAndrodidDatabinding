package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
    private MyClickHandler myClickHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Person p1=new Person("AJINKYA","AJ@GMAIL.COM");
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main2);

        binding.setPerson(p1);
        myClickHandler=new MyClickHandler(this);
        binding.setClickHandler(myClickHandler);
    }
}