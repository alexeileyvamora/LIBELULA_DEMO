package com.libelulasoft.pokemon.data.remote;



import com.libelulasoft.pokemon.domain.model.pokemoninfo.PokemonInfoAPI;
import com.libelulasoft.pokemon.domain.model.pokemonlist.PokemonListAPI;

import io.reactivex.rxjava3.core.Observable;

public class APIClient {

    private final APIService apiService;

    public APIClient(APIService apiService) {
        this.apiService = apiService;
    }

    public Observable<PokemonListAPI> observableFetchPokemonList(int offset) {
        return apiService.fetchPokemonList(offset);
    }

    public Observable<PokemonInfoAPI> observableFetchPokemonInfo(String name) {
        return apiService.fetchPokemonInfo(name);
    }
}
