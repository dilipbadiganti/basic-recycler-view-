package com.example.recyclerfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SampleModel> sampleModels = new ArrayList<>();
    int[] sampleImages = {R.drawable.java_icon,R.drawable.python_icon,
            R.drawable.csharp_icon,R.drawable.js,R.drawable.cpp,R.drawable.go,
            R.drawable.swift,R.drawable.kotlin,R.drawable.ruby,R.drawable.php};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.myrecycler);
        setUpSampleModels();
        Adapter_ForSample adapter = new Adapter_ForSample(this,sampleModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void setUpSampleModels(){
        String[] languages = getResources().getStringArray(R.array.language_array);
        String[] founders = getResources().getStringArray(R.array.founders_array);


        for(int i=0;i<languages.length;i++){
            sampleModels.add(new SampleModel(languages[i],founders[i],sampleImages[i]));
        }


    }



}