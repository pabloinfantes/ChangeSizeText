package com.example.changesizetext;

import android.app.Application;

import com.example.changesizetext.data.model.User;

/**
    Clase que pide al usuario un texto y un tamaño mediante el componente SeekBar
 se inicialiaza un TextView
 */
public class ChangeSizeApplication extends Application {
    private User user;

    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Pablo","pabloinfantes@gmail.com");
    }

    public User getUser() {
        return user;
    }
}
