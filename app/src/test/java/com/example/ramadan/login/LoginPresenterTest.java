package com.example.ramadan.login;

import com.example.ramadan.tdd_course.login.LoginPresenter;
import com.example.ramadan.tdd_course.login.LoginView;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoginPresenterTest {

    public static  String USERNAME ="Ramadan";
    public static  String PASS ="123";

    public static  String WRONG_USERNAME ="Maria";
    public static  String WRONG_PASS ="xyz";
    LoginPresenter loginPresenter;
    LoginView mockedView;

    @Before
    public void setup(){
         mockedView = mock(LoginView.class);
         loginPresenter = new LoginPresenter(mockedView);
    }

    @Test
    public void checkUserCanGotoTheMainscreenIfTheCredentialsAreCorrect(){
      loginPresenter.login(USERNAME,PASS);
      verify(mockedView).gotoMainScreen();

   }

    @Test
    public void checkuserHaveErrorMsgIfThereAreWrongCredentials(){
     loginPresenter.login(WRONG_USERNAME,WRONG_PASS);
      verify(mockedView).showErrorMsg();
    }


   @Test
    public void chechUserWillGetErrorMsgWhenHeExceedtheAttemptsCount(){
        loginPresenter.login(WRONG_USERNAME,WRONG_PASS);
        loginPresenter.login(WRONG_USERNAME,WRONG_PASS);
        loginPresenter.login(WRONG_USERNAME,WRONG_PASS);
        loginPresenter.login(WRONG_USERNAME,WRONG_PASS);
        verify(mockedView).showAttemptsErrorMsg();
   }




}
