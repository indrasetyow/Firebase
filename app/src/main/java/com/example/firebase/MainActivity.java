package com.example.firebase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private Button bTambah,bLihat;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    bTambah = findViewById(R.id.btTambah);
    bLihat = findViewById(R.id.btLihat);

    bTambah.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(TambahData.getActIntent(MainActivity.this));
      }
    });
    bLihat.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(LihatBarang.getActIntent(MainActivity.this));

      }
    });
  }
}