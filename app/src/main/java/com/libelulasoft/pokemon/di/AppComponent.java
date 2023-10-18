package com.libelulasoft.pokemon.di;


import com.libelulasoft.pokemon.data.repository.DetailRepository;
import com.libelulasoft.pokemon.data.repository.MainRepository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, DatabaseModule.class})
public interface AppComponent {

    void injectMainRepository(MainRepository mainRepository);

    void injectDetailRepository(DetailRepository detailRepository);
}
