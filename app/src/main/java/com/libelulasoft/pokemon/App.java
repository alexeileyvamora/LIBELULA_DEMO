package com.libelulasoft.pokemon;

import android.app.Application;

import com.libelulasoft.pokemon.di.AppComponent;
import com.libelulasoft.pokemon.di.DatabaseModule;
import com.libelulasoft.pokemon.di.DaggerAppComponent;
import com.libelulasoft.pokemon.di.NetworkModule;

public class App extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().networkModule(new NetworkModule()).databaseModule(new DatabaseModule(this)).build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
