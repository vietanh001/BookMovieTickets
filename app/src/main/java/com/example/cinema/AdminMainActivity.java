package com.example.cinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.cinema.admin.AddMovieActivity;
import com.example.cinema.admin.AddRoomActivity;
import com.example.cinema.admin.IncomeActivity;
import com.example.cinema.admin.ListMovieActivity;
import com.example.cinema.admin.ListTicketActivity;
import com.example.cinema.admin.SetUpActivity;
import com.google.firebase.auth.FirebaseAuth;

public class AdminMainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout vDSPhim, vThemPhim, vThemPhong, vSetUpPhim, vDSVe, vDoanhThu;
    private View vLogout;

    private FirebaseAuth auth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        initView();
        vDSPhim.setOnClickListener(this);
        vThemPhim.setOnClickListener(this);
        vThemPhong.setOnClickListener(this);
        vSetUpPhim.setOnClickListener(this);
        vDSVe.setOnClickListener(this);
        vDoanhThu.setOnClickListener(this);
        vLogout.setOnClickListener(this);
    }

    private void initView() {
        vLogout = findViewById(R.id.vLogout);
        vDSPhim = findViewById(R.id.vDSPhim);
        vThemPhim = findViewById(R.id.vThemPhim);
        vThemPhong = findViewById(R.id.vThemPhong);
        vSetUpPhim = findViewById(R.id.vSetUpPhim);
        vDSVe = findViewById(R.id.vDSVe);
        vDoanhThu = findViewById(R.id.vDoanhThu);
    }

    @Override
    public void onClick(View view) {
        if(view == vDSPhim){
            Intent intent = new Intent(AdminMainActivity.this, ListMovieActivity.class);
            startActivity(intent);
            finish();
        }

        if(view == vThemPhim){
            Intent intent = new Intent(AdminMainActivity.this, AddMovieActivity.class);
            startActivity(intent);
            finish();
        }

        if(view == vThemPhong){
            Intent intent = new Intent(AdminMainActivity.this, AddRoomActivity.class);
            startActivity(intent);
            finish();
        }


        if(view == vSetUpPhim){
            Intent intent = new Intent(AdminMainActivity.this, SetUpActivity.class);
            startActivity(intent);
            finish();
        }

        if(view == vDSVe){
            Intent intent = new Intent(AdminMainActivity.this, ListTicketActivity.class);
            startActivity(intent);
            finish();
        }

        if(view == vDoanhThu){
            Intent intent = new Intent(AdminMainActivity.this, IncomeActivity.class);
            startActivity(intent);
            finish();
        }

        if(view == vLogout){
            auth.signOut();
            finish();
            Toast.makeText(this, "Đăng xuất tài khoản!!!", Toast.LENGTH_SHORT).show();
        }
    }
}