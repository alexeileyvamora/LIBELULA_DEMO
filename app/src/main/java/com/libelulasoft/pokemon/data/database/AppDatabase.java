package com.libelulasoft.pokemon.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.libelulasoft.pokemon.domain.model.pokemoninfo.PokemonInfoAPI;
import com.libelulasoft.pokemon.domain.model.pokemonlist.ResultsResponse;


@Database(entities = {ResultsResponse.class, PokemonInfoAPI.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract PokemonListDAO pokemonListDAO();

    public abstract PokemonInfoDAO pokemonInfoDAO();
}
