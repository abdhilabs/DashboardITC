package com.mriksani.dashboarditc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    TextView tvUser, tvNama, tvEmail, tvAsal;
    String strNama, strUser, strEmail, strAsal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Bundle bundle = getIntent().getExtras();
        strNama = bundle.getString("NAMA");
        strUser = bundle.getString("USER");
        strEmail = bundle.getString("EMAIL");
        strAsal = bundle.getString("ASAL");

        tvUser = findViewById(R.id.getUser);
        tvUser.setText(strUser);

        tvNama = findViewById(R.id.getNama);
        tvNama.setText(strNama);

        tvEmail = findViewById(R.id.getEmail);
        tvEmail.setText(strEmail);

        tvAsal = findViewById(R.id.getAsal);
        tvAsal.setText(strAsal);
    }

    public void Kembali(View view) {
        finish();
    }
}
