package com.libelulasoft.pokemon.di;

import android.app.Application;

import androidx.room.Room;


import com.libelulasoft.pokemon.data.database.AppDatabase;
import com.libelulasoft.pokemon.data.database.PokemonInfoDAO;
import com.libelulasoft.pokemon.data.database.PokemonListDAO;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    private final Application application;

    public DatabaseModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(Application application) {
        return Room.databaseBuilder(application, AppDatabase.class, "PokemonDatabase")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    @Provides
    @Singleton
    PokemonListDAO providePokemonListDAO(AppDatabase appDatabase) {
        return appDatabase.pokemonListDAO();
    }

    @Provides
    @Singleton
    PokemonInfoDAO providePokemonInfoDAO(AppDatabase appDatabase) {
        return appDatabase.pokemonInfoDAO();
    }
}
