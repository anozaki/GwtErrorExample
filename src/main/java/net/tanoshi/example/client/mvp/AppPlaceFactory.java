package net.tanoshi.example.client.mvp;

import javax.inject.Inject;
import javax.inject.Provider;

import net.tanoshi.example.client.home.HomePlace;

public class AppPlaceFactory {

    @Inject
    HomePlace.Tokenizer testTokenizer;

    @Inject
    Provider<HomePlace> testPlace;

    public HomePlace.Tokenizer getTestTokenizer() {
        return testTokenizer;
    }

    public HomePlace getTestPlace() {
        return testPlace.get();
    }

}
