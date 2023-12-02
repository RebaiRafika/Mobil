package com.example.rafika_rebai_lsi3_devmobil_mesure_glycemie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rafika_rebai_lsi3_devmobil_mesure_glycemie.R;

public class HomeActivity extends AppCompatActivity {
private Button btnConsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnConsultation =(Button)findViewById(R.id.btnConsulter);
        btnConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}