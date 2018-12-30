package com.example.ramadan.tdd_course;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ramadan.tdd_course.login.LoginPresenter;
import com.example.ramadan.tdd_course.login.LoginView;
import com.example.ramadan.tdd_course.login.ProfileActivity;

public class MainActivity extends AppCompatActivity implements LoginView{

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenter = new LoginPresenter(this);
    }



    @Override
    public void gotoMainScreen() {
     startActivity(new Intent(getApplicationContext(), ProfileActivity.class));

    }

    @Override
    public void showErrorMsg() {
        Toast.makeText(this, "Please enter valid username and password", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAttemptsErrorMsg() {
        Toast.makeText(this, "You consumed three attempts of login", Toast.LENGTH_SHORT).show();
    }
}
