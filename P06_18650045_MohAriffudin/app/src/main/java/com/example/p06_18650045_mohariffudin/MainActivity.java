package com.example.p06_18650045_mohariffudin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Amalia", "1565000", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Risky", "1565000", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Binti", "1565000", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("ZamZam", "1565000", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Ariffudin", "18650045", "082228882543"));
    }
}
