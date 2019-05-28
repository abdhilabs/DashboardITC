package com.mriksani.dashboarditc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eNama, eUser, eEmail, eAsal;
    String strNama, strUser, strEmail, strAsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNama = findViewById(R.id.eNama);
        eUser = findViewById(R.id.eUser);
        eEmail = findViewById(R.id.eEmail);
        eAsal = findViewById(R.id.eAsal);

    }

    public void Simpan(View view) {
        strUser = eUser.getText().toString();
        strNama = eNama.getText().toString();
        strEmail = eEmail.getText().toString();
        strAsal = eAsal.getText().toString();

        Intent move = new Intent(this, DashboardActivity.class);
        move.putExtra("USER", strUser);
        move.putExtra("NAMA", strNama);
        move.putExtra("EMAIL", strEmail);
        move.putExtra("ASAL", strAsal);
        startActivity(move);
    }
}
