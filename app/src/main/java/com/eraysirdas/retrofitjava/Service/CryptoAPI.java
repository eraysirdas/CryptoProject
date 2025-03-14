package com.eraysirdas.retrofitjava.Service;

import com.eraysirdas.retrofitjava.Model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();

}
