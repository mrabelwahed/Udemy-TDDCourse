package com.example.ramadan.tdd_course.login;

public class LoginPresenter {

    LoginView view;

    public static  String USERNAME ="Ramadan";
    public static  String PASS ="123";

    public int attemptsCount;
    public static int MAX_ATTEMPTS_COUNT = 3;


    public  LoginPresenter(LoginView view){
        this.view = view;
    }


    public void login(String username, String pass) {

        if (isAttemptsCountExceeded()){
            view.showAttemptsErrorMsg();
            return;
        }

       if (username.equals(USERNAME) && pass.equals(PASS)){
           view.gotoMainScreen();
       }else {
            incrementAttemptsCount();
           view.showErrorMsg();
       }

    }

    private int incrementAttemptsCount() {
        return attemptsCount++;
    }


    private boolean isAttemptsCountExceeded(){
        return  attemptsCount >= MAX_ATTEMPTS_COUNT;
    }


}
