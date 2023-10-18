package com.libelulasoft.pokemon.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.libelulasoft.pokemon.data.repository.DetailRepository;
import com.libelulasoft.pokemon.domain.model.pokemoninfo.PokemonInfoAPI;


public class DetailViewModel extends ViewModel {

    private final LiveData<PokemonInfoAPI> pokemonInfoLiveData;

    private final LiveData<Boolean> progressBarLiveData;

    private final LiveData<String> toastLiveData;

    public DetailViewModel() {
        pokemonInfoLiveData = DetailRepository.getPokemonInfoLiveData();
        progressBarLiveData = DetailRepository.getProgressBarLiveData();
        toastLiveData = DetailRepository.getToastLiveData();
    }

    public LiveData<PokemonInfoAPI> getPokemonInfoLiveData() {
        return pokemonInfoLiveData;
    }

    public LiveData<Boolean> getProgressBarLiveData() {
        return progressBarLiveData;
    }

    public LiveData<String> getToastLiveData() {
        return toastLiveData;
    }
}
